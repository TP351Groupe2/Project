package edu.iut;

/**
 * 
 * Main program showing the instantiation of
 * object by using the "new" operator
 *
 */
public class FirstJavaObject {

	public static void main(String[] args) {
		
			MyFirstObject myFirstObject1 = new MyFirstObject();
			MyFirstObject myFirstObject2;
			myFirstObject1.myFirstMethod();  // valid call
			myFirstObject2.myFirstMethod();  // invalid call (non instantiate object)
			
	}
}
