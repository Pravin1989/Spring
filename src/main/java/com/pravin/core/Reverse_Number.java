package com.pravin.core;

public class Reverse_Number {
	public static void main(String[] args) {
		int no=2222,reverse=0;
		while(no!=0){
			reverse=reverse*10;
			reverse=reverse+no%10;
			no=no/10;			
		}
		System.out.println(reverse);		
		if(2222==reverse){
			System.out.println("No is palindrom");
		}
	}
}