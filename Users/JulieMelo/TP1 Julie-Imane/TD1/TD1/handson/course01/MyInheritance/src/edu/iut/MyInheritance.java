package edu.iut;
/**
 * 
 * This program show an Inheritance case
 *
 */
public class MyInheritance {

	public static void main(String[] args) {
		
		Employee myEmployee = new Employee();
		myEmployee.setName("John Doe."); // from Person class
		myEmployee.setSalary(5000.0);    // from Employee class
		System.err.println(myEmployee);  // use implicilty 'toString' to display
	}
}
