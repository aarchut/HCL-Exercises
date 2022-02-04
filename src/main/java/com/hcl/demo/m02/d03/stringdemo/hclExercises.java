package com.hcl.demo.m02.d03.stringdemo;

import java.util.StringTokenizer;

public class hclExercises {

	public static void main(String[] args) {

		// 1
		StringBuffer rt = new StringBuffer("ANNA_EDITH_ARCHUT");
		rt = rt.replace(4, 5, ":");
		rt = rt.replace(10,11, ":");
		System.out.println(rt);
		
		System.out.println();
		
		//2
		StringBuffer da = new StringBuffer("10/12/2017");
		rt.append(da);
		System.out.println(rt);
		
		System.out.println();

		//2
		StringTokenizer st = new StringTokenizer("ANNA_EDITH_ARCHUT", "_");
		while (st.hasMoreTokens()) {
			System.out.println("First name: " + st.nextToken());
			System.out.println("Middle name: " + st.nextToken());
			System.out.println("Last name: " + st.nextToken());

			System.out.println();
		}
		
		//3
		StringTokenizer date = new StringTokenizer("10/12/2017", "/");
		while (date.hasMoreTokens()) {
			System.out.println("Month: " + date.nextToken());
			System.out.println("Day: " + date.nextToken());
			System.out.println("Year: " + date.nextToken());
		}	
		

}
}
