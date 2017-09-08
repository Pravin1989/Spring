package com.pravin.core;

import java.util.Arrays;

public class StringPatternTest {
	public static void main(String[] args) {
		String str="abc1";
		String str1="cab1";
		
		char []c1=str.toCharArray();
		Arrays.sort(c1);
		String n1=String.valueOf(c1);
		
		char []c2=str1.toCharArray();
		Arrays.sort(c2);
		String n2=String.valueOf(c1);
		System.out.println(n1+" "+n2);
		
		if(n1.equals(n2)){
			System.out.println("Same");
		}
	}
}