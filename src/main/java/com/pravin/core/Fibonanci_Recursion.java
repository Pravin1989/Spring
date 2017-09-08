package com.pravin.core;

public class Fibonanci_Recursion {
	static int first=0,second=1,sum;
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int no=10;
		System.out.println(i);
		System.out.println(j);
		fibonacci(no-2);	
	}

	public static void fibonacci(int number) {		
		if (number>0) {
			sum = first + second;
	         first = second;
	         second = sum;
	         System.out.println(sum);
	         fibonacci(number-1);
		}		
	}
}