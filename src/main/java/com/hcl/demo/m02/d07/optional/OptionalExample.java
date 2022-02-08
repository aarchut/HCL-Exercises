package com.hcl.demo.m02.d07.optional;

import java.util.Optional; 


public class OptionalExample {
	public static void main(String[] args) {
		String[] str = new String[20];
		str[10]= "this is an example";
		Optional<String> checkNull = Optional.ofNullable(str[10]);
		if(checkNull.isPresent()) {
			String uppercaseString = str[10].toUpperCase();
			System.out.println(uppercaseString);
		}else 
			System.out.println("String value is not present");
	}

}
