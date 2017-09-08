package com.pravin.core;

public class MyStringTest {
	public static void main(String[] args) {
		String str="Pravin";
		String str1= new String("Amit");
		System.out.println(str==str1);
		String str2=str1.intern();
		System.out.println(str1==str2);		
		System.out.println(str2=="Amit");
		
	}
}