package edu.iut;
/**
 * 
 * HelloWorldFR implements HelloWorldInsterface (IHelloWorld)
 * This object implement the function "sayHelloWorld" to
 * return "Hello World" translated in French
 *
 */
public class HelloWorldFR implements IHelloWorld {

	/**
	 * Default contructor
	 */
	public HelloWorldFR()
	{}
	
	/**
	 * Implementation of the interface IHelloWorld
	 * @return the string "Bonjour le monde" tranlation of "Hello World" in french
	 */
	@Override
	public String sayHelloWorld() {	
		return "Bonjour le monde";
	}
}
