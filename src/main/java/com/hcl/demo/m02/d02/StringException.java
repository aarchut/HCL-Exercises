package com.hcl.demo.m02.d02;

public class StringException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StringException() {
		System.out.println("StringExpection has been thrown");
	}
	public String toString() {
		return("The string is over 20 characters" );
	}

}
