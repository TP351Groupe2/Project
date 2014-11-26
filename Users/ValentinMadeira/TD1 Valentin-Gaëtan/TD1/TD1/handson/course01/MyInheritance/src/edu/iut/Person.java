package edu.iut;

/**
 * 
 * Object defining a Person
 * Here the person property is the name
 *
 */
public class Person {
	private String name;
	/**
	 * Default constructor
	 * set the name with empty string
	 */
	public Person() {
	 name = "";
	}
	
	/**
	 * Set the name
	 * @param name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *  @return the name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return a string containing the name of the person
	 */
	public String toString()
	{
		return "The person name is '" + name +"'.";
	}

}
