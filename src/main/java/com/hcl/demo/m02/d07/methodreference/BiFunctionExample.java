package com.hcl.demo.m02.d07.methodreference;

import java.util.function.BiFunction;

class MathOperation {
	public static int mult(int a, int b) {
		return a*b;
	}
}

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> multiplier = MathOperation::mult;
		int solution = multiplier.apply(12, 12);
		System.out.println(solution);
	}

}
