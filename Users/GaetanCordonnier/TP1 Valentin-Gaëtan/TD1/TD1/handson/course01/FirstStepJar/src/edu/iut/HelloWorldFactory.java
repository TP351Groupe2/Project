package edu.iut;

public class HelloWorldFactory {
	
	
	public HelloWorldFactory()
	{}
	
	public edu.iut.IHelloWorld getHelloWorld(String language) throws LanguageException
	{
		if (language == "fr") {
			return new edu.iut.HelloWorldFR();
		}
		if (language == "en") {
			return new edu.iut.HelloWorldEN();
		}
		throw new LanguageException("Language '"+language+"' is unknown.");
	}

}
