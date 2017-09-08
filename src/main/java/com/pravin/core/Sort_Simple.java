package com.pravin.core;

public class Sort_Simple {
	public static void main(String[] args) {
		int array[] = { 1334, 235, 23, 523, 52, 3532, 5325 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		for (int k : array) {
			System.out.println(k);
		}
	}
}