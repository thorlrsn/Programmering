package project3;

import java.awt.Color;
import java.awt.Point;

public class Oak implements Tree {
	
	
	private double size;
	private Point pos;
	public double x;
	private double y;

	public Oak(Point pos, double size) {
		
		this.pos = pos;
		this.size = size;
		//x = pos.getX();
		//y = pos.getY();
	}
	
	@Override
	public double grow() {
		this.size = size*2; //THIS SIZE NEEDS TO CHANGE FOR THE DIFFERENT TREES//
		return size;
	}

	@Override
	public Color getColor() {
		Color color = Color.GREEN; //THIS COLOR NEEDS TO CHANGE FOR THE DIFFERENT TREES//
		return color;
	}

	@Override
	public double getPosition() {
		this.x = pos.getX();
		//y = pos.getY();	 //HOW TO DO THIS RETURN?? Says 'x cannot be resolved or is not a field' - it cant find the variable declaration somehow...
		return x;
	}

	@Override
	public  double getSize() {	
		return size;
	}


	
	
}
