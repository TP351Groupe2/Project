package edu.iut;

/**
 * 
 * This program show how and abstract method work
 *
 */
public class FigureScaling {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(4);
		rectangle.setHeight(2);
		rectangle.setScaleFactor(2.5);
		System.err.println(rectangle);
	}
}
