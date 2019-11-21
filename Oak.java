package project3;

import java.awt.Color;
import java.awt.Point;

public class Oak extends Tree {

	protected Point pos;
	protected double size;

	public Oak(Point pos, double size) {
		this.pos = pos;
		this.size = size;
	}
	
	public Color OakColor() {
		return Color.blue;
	}

	public double growth() {		
		size = size*6;
		return size;
	}
	
	public double getSize() {
		return size;
	}



}
