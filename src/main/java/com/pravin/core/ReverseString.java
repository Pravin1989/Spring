package com.pravin.core;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Hi I am Pravin";
		String d="";
		char c;
		for (int i = name.length() - 1; i >= 0; i--) {
			c=name.charAt(i);
			//d+=String.valueOf(c);
			System.out.print(c);
		}
		//System.out.print(d);
	}
}