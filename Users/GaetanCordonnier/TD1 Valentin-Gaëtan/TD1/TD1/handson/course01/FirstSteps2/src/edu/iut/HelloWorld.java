package edu.iut;

/**
 * Hello World is a simple program which display a string
 */
class HelloWorld
{
  /**
  * Main program display the string 'Hello world.'   
  * @param args  program parameters
  */
  public static void main(String[] args)
  {
    HelloWorldDisplayer helloWorld = new HelloWorldDisplayer(3);
    System.out.println(helloWorld);
  }
}
