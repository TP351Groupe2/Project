package edu.iut;

/**
 * 
 * Employee object extends Person by adding the salary
 *
 */
public class Employee extends Person {

	private double salary;
	/**
	 * Default constructor set salary to 
	 * 0
	 */
	public Employee(){
		salary = 0.0;
	}
	/**
	 * Set the salary
	 * @param salary value to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**	 
	 * @return the salary of the employee
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @return the name of the person and the salary
	 * by accessing the super class 'Person'
	 * and concat the value of the salary.
	 */
	public String toString()
	{
		return super.toString() + " The salary is '"+salary+"'.";
	}
}
