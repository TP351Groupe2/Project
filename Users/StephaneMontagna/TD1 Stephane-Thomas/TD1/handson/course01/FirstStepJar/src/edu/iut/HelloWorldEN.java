package edu.iut;

/**
 * 
 * HelloWorldFR implements HelloWorldInsterface (IHelloWorld)
 * This object implement the function "sayHelloWorld" to
 * return "Hello World"
 *
 */
public class HelloWorldEN implements IHelloWorld {
	/**
	 * Default contructor
	 */
	public HelloWorldEN()
	{}
	
	/**
	 * Implementation of the interface IHelloWorld
	 * @return the string  "Hello World" 
	 */
	@Override
	public String sayHelloWorld() {		
		return "Hello World";
	}
}
