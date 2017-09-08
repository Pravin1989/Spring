package com.pravin.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	public static void main(String[] args) {
		
		//Convert List to Array
		
		List<String> list = new ArrayList<String>();

		list.add("Pravin");
		list.add("Amit");
		list.add("Arohi");
		list.add("Kumar");

		Object[] strArry = list.toArray();
		for (Object s : strArry)
			System.out.println(s);
		
		//Convert Array to List
		
		String []stringDetails={"Pravin","Kiran","Sujit","Ajit","Amit"};
		System.out.println(Arrays.asList(stringDetails));
	}
}