package project3;

import java.awt.Color;
import java.awt.Point;

public class Tree {
	
	protected Point pos;
	protected double size;
	protected Color col;
	
	
	public Tree(Point bleh, double pluh) {
	
	this.pos = bleh;
	this.size = pluh;
	
		
		
	}
	
	public double grow() {
		
		double newSize = 0;
		
		if( getColor() == Color.blue){
			newSize = size * 6;
		}
		return newSize;
	}

	public Color getColor() {
		return col;
	}

	public Object getPosition() {
		
		pos.getX();
		
		
		return null;
		
		
		
		
	}

	public double getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
