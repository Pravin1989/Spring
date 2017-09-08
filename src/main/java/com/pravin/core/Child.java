package com.pravin.core;

public class Child extends Parent {
	public Child() {
	System.out.println("Inside Child");
	}
	@Override
	public void doAbstract() {
		System.out.println("Inside Abstract Child Implementation");

	}
	public static void main(String[] args) {
		Parent p=new Child();
		p.doAbstract();
		p.letMe();
		MyInterface infc=new MyInterface() {
			
			@Override
			public void doWell() {
				System.out.println("Inside My doWell");
				
			}
		};
		infc.doWell();
	}
}