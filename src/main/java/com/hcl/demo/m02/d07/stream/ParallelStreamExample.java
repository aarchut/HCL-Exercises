package com.hcl.demo.m02.d07.stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		
		System.out.println("Hello...");
		
		IntStream range = IntStream.rangeClosed(1, 5);
		range.forEach(System.out::println);
		
		System.out.println("World...");
		
		IntStream range2 = IntStream.rangeClosed(1, 5);
		range2.parallel().forEach(System.out::println);
	}
	
	

}
