package com.hcl.demo.m02.d07.lambda;

interface Multiplication{
	int mult(int a, int b);
	
}

public class LambdaExpressionExample {
	public static void main(String[] args) {
		
		Multiplication mu1=(a,b)->(a*b);
		System.out.println(mu1.mult(3, 5));
		
		Multiplication mu2=(int a, int b)->{
			return(a*b);
		};
		System.out.println(mu2.mult(20,5));

		
	}
	
}
