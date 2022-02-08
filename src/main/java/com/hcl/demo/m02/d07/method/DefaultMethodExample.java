package com.hcl.demo.m02.d07.method;

//default and static methods in interface

public class DefaultMethodExample {
	public static void main(String [] args) {
		Movie movie = new Film();
		movie.print();
	}
}

interface Movie {
	default void print() {
		System.out.println("This is a movie");
		
	}
	static void quote() {
		System.out.println("This is a quote from the movie");
	}
}

interface Show {
	
	default void print() {
		System.out.println("This a show");
	}
	
}

class Film implements Movie, Show {
	public void print() {
	Movie.super.print();
	Show.super.print();
	Movie.quote();
	System.out.print("This is a film");
	
}
}

