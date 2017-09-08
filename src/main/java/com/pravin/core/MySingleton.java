package com.pravin.core;

public class MySingleton {

	private static MySingleton single = new MySingleton();;
	private static int count = 0;

	private MySingleton() {
		System.out.println("Inside Constructor " + count);
	}

	public static MySingleton getInstance() {
		if (count <2) {			
			single = new MySingleton();
			count++;
		}
		return single;
	}

	public void printData() {
		System.out.println("Print");
	}
}