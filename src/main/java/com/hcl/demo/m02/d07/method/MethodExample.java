package com.hcl.demo.m02.d07.method;

interface Message {
	public void sayMessage();
}

public class MethodExample {
	public static void main(String [] args) {
		Message myMessage = () -> { System.out.println("This is my message"); 
		};
		
		myMessage.sayMessage();
		
	}

}
