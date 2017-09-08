package com.pravin.core;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		int[] a = { 13, 32, 23, 14, 45 };
		int b = 32768, c = 32768;
		System.out.println(b + c);
		Arrays.sort(a);
		for (int d : a) {
			System.out.println(d);
		}
	}
}