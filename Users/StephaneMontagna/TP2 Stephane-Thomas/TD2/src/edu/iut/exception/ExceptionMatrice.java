package edu.iut.exception;

public class ExceptionMatrice extends Exception {
	String message;
	
	public ExceptionMatrice(String s) {
		message = s;
	}
	
	public String toString() {
		return message;
	}
}
