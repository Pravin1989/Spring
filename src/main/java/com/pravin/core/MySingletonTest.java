package com.pravin.core;

public class MySingletonTest {

	public static void main(String[] args) {
		MySingleton m=MySingleton.getInstance();
		MySingleton m1=MySingleton.getInstance();
		MySingleton m3=MySingleton.getInstance();
		MySingleton m4=MySingleton.getInstance();
		MySingleton m5=MySingleton.getInstance();
		m.printData();
		m1.printData();
	}
}
