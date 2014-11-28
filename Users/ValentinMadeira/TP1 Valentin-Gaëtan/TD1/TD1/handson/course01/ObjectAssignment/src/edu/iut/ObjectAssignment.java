package edu.iut;

/**
 * 
 * Main program : assignment 
 *
 */
public class ObjectAssignment {

	public static void main(String[] args) {
		
		MyFirstAssignment myFirstAssignment1 = new MyFirstAssignment();
		MyFirstAssignment myFirstAssignment2 = new MyFirstAssignment();
		
		myFirstAssignment1.setValue(1);
		myFirstAssignment2.setValue(2);
		
		// display the object 
		System.err.println("** Display the objects newly created.");
		System.err.println(myFirstAssignment1);
		System.err.println(myFirstAssignment2);
		
		// assignment
		myFirstAssignment2 = myFirstAssignment1;
		System.err.println("** Display the objects after '=' assignment.");		
		System.err.println(myFirstAssignment1);
		System.err.println(myFirstAssignment2);
		
		// modification of assigned object 
		myFirstAssignment2.setValue(3);
		System.err.println("** Display the objects after a changment on assigned object.");
		System.err.println(myFirstAssignment1);
		System.err.println(myFirstAssignment2);

	}
}
