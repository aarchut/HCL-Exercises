package com.hcl.demo.m02.d07.methodreference;

interface Note{
	void message();
}

public class MethodReference {
	public static void myMessage() {
		System.out.println("This is my static method");
	}
	public static void main(String[] args) {
		Note note = MethodReference::myMessage;
		note.message();
	}

}
