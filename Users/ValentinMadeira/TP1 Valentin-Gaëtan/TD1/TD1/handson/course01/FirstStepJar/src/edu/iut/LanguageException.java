package edu.iut;

/**
 * 
 * Exception Class managing or unknwon language
 * This Exception is raised when a language is not managed by
 * the HelloWorldFactor object
 * 
 */
public class LanguageException extends Exception {

	/**
	 * Default constructor
	 */
	public LanguageException()
	{ super(); }
	
	/**
	 * Construct an exception with a message
	 * @param message recorded by the exception
	 */
	public LanguageException(String message)
	{ super(message); }
	/**
	 * Construct a exception from another exception
	 * @param cpy is a the exception to copy
	 */
    public LanguageException(LanguageException cpy)
    { super(cpy); }
}
