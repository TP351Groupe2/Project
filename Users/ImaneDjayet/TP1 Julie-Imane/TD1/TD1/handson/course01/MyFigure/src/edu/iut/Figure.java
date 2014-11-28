package edu.iut;

public abstract class Figure {
	/**
	 * scale factor use to transform
	 * a figure
	 */
	private double scaleFactor;
	
	/**
	 * Default constructor
	 * set scale factor to 1.0
	 */
	public Figure() {
		scaleFactor = 1.0;
	}
	
	/**
	 * 
	 * @param scaleFactor to set and apply scale factor
	 */
	public void setScaleFactor(double scaleFactor) {
		this.scaleFactor = scaleFactor;
		this.applyScaleFactor();
	}
	
	/**
	 * 
	 * @return the scale factor
	 */
	public double getScaleFactor() {
		return scaleFactor;
	}
	
	/**
	 * return a string with scale factor
	 */
	public String toString()
	{ return "Scale factor is '"+scaleFactor+"'."; }
	
	/**
	 * abstract method specific to implemented 
	 * figure. This method should transform the
	 * parameters of a Figure
	 */
	public abstract void applyScaleFactor();	
}
