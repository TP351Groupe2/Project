package edu.iut;

import javax.swing.event.*;

/**
 * Hello World is a simple class which repeat 
 * a string
 */

public class HelloWorldDisplayer
{
  private String[] arrayOfHelloWorld = null;
  public HelloWorldDisplayer(int repeatN)
  {
    arrayOfHelloWorld = new String[repeatN];
    for (int ri = 0;ri<repeatN;ri++)
    {
      arrayOfHelloWorld[ri] = "Hello World "+ri;
    }
  }

  /**
   * @return a string contaiing a list of 'Hello World' 
  */
  public String toString()
  {
    String concatenedStrings = "";
    if (arrayOfHelloWorld != null)
    {
      for (int si = 0;si<arrayOfHelloWorld.length;si++)
      {
        concatenedStrings+=(arrayOfHelloWorld[si] + "\n");
      } 
    }
    return concatenedStrings;
  }
  public void doWhile()
  {
     boolean condition = true;
     int i = 0;
     do
      {
        condition = (i++ < 10);
	      /* do something until condition is true */ 
      }while(condition);
  }
}
