package com.pravin.collection;

import java.util.Stack;

public class My_Stack {
	public static void main(String[] args) {
		Stack<String> st=new Stack<>();
		
		System.out.println(st.capacity());
		st.push("Pravin");
		st.push("Argentina");
		st.push("Latur");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());		
	}
}