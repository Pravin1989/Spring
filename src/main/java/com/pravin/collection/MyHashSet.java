package com.pravin.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		String a="Pravin";
		String b=new String("Pravin");
		set.add(a);
		set.add(b);
		System.out.println(set.size());
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		Integer i=new Integer(10);
		Integer j=new Integer(20);
		map.put(10,11);
		map.put(i,12);
		System.out.println(map.size());
	}
}