package edu.iut;

/**
 * 
 * Object used to illustrate the assignment
 * with '"' operator;
 *
 */
public class MyFirstAssignment {
  
  protected int value;
	
  public MyFirstAssignment(){
	  value = 0;
  }
  
  public void setValue(int value)
  {
	  this.value = value;
  }
  public int getValue() { 
	  return value;
  }
  /**
   * @return a string containing the 'value'
   */
  public String toString()
  {
	  return "The value is '"+value+"'.";
  }  
}
