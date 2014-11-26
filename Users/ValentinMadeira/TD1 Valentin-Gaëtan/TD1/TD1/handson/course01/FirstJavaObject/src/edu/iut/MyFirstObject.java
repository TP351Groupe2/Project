package edu.iut;

/**
 * 
 * My FirstObject is used to illustrate
 * the course. This object do nothing
 *
 */
public class MyFirstObject {
	
	public int myPublicAttribute;
	private double myPrivateDoubleAttribute;
	protected String myPrivateStringAttribute;

	
	/**
	 * Default constructor
	 */
	public MyFirstObject()
	{}
	
	/**
	 * Display the string "My first method." on error 
	 */
	public void myFirstMethod() { 
		System.err.println("My first method.");
	}
	
	/**
	  * Method without argument displaying a string
	  *   
	  */
	  private void myPrivateMethod()
	  {
	    System.out.println("This method is not visible");
	  }

	   /**
	  * Method without argument displaying a string
	  *   
	  */
	  protected void myProtectedMethod()
	  {
	    System.out.println("This method is not visible but by the daughter classes");
	  }
	
}
