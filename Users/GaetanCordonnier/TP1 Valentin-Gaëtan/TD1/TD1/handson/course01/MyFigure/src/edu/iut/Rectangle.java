package edu.iut;

public class Rectangle extends Figure {

	private double height; // heigth of the rectangle
	private double width;  // width of the rectangle

	
	/**
	 * Default constructor
	 * set height and width to default value 1.0
	 */
	public Rectangle() {
		super();
		this.height = 1.0;
		this.width  = 1.0;
	}
	
	/**
	 * Override function applyScaleFactor
	 * modify the value width and height
	 * are multiply by the scale factor. 
	 */
	
	@Override
	public void applyScaleFactor() {
		this.width  *= super.getScaleFactor();
		this.height *= super.getScaleFactor();
	}
	
	/**
	 * @param width of the rectangle
	 */
	public void setWidth(double width) {
		this.width  = width;	
	}
	/**
	 * 
	 * @return width of the rectangle
	 */
	public double getWidth()
	{ return this.width; }
	
	/**
	 * @param height of the rectangle
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/** 
	 * @return height of the rectangle
	 */
	public double getHeight() {
		return this.height;
	}
	
	public String toString() { 
		return super.toString() 	
			  + " The rectangle properties are W:"
			  + this.width+" and H:"
			  + this.height;
	}
}
