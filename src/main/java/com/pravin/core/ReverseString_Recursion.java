package com.pravin.core;

public class ReverseString_Recursion {

	public static void main(String[] args) {

		System.out.println(reverse("I am in Yash Technology"));
	}

	public static String reverse(String str) {
		if (str == null || str.length() < 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}