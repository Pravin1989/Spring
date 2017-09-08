package com.pravin.core;

public abstract class Parent {
	public abstract void doAbstract();

	public Parent() {
		System.out.println("In Parent");
	}
	public void letMe(){
		System.out.println("Inside parent of Let me");
	}
}