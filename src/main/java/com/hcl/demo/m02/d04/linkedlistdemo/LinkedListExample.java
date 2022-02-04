package com.hcl.demo.m02.d04.linkedlistdemo;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("List of items: " + cars);
		System.out.println();
		System.out.println("First item: " + cars.getFirst());
		System.out.println();
		System.out.println("Last item: " + cars.getLast());
		System.out.println();
		cars.removeFirst();
		System.out.println("New List removing the first item: " + cars);
		System.out.println();
		cars.add("Toyota");
		System.out.println("New list adding a new item: " + cars);
		System.out.println();	
		cars.removeLast();
		System.out.println("New List removing the last item: " + cars);

	}

}
