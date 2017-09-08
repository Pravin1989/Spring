package com.pravin.core;

public class Factorial_Recursive {
	static int factorial(int n) {
		if (n == 1)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		System.out.println("Factorial of 5 is: " + factorial(5));
		String s1="Pravin";//=new String("Yash");
		String s2="Pravin";//=new String("Yash");
		
		if(s1==s2){
			System.out.println("Hiii");
		}	
	}
}