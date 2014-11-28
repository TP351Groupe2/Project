package edu.iut;

/**
 * 
 * Main program
 *
 */
public class FamousHelloWorld {

	public static void main(String[] args) 
	{
		
		HelloWorldFactory helloWorldFactory = new HelloWorldFactory();
		try
		{
			System.err.println(helloWorldFactory.getHelloWorld("fr").sayHelloWorld());
			System.err.println(helloWorldFactory.getHelloWorld("en").sayHelloWorld());
			System.err.println(helloWorldFactory.getHelloWorld("gr").sayHelloWorld());
		}
		catch(LanguageException langEx)
		{
			System.err.print(langEx);
		}		
	}	
}
