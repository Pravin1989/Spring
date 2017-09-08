package com.pravin.core;

public class Reverse_Number_Recursive {
	static int rev = 0;

	public static void main(String[] args) {
		System.out.println(reverse(134));
	}

	static int reverse(int num) {
		if (num < 10) {
			rev = rev * 10 + num;
		} else {
			rev = rev * 10 + (num % 10);
			num = reverse(num / 10);

		}
		return rev;
	}
}