package com.pravin.collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyHashTable {
	public static void main(String[] args) {
		Hashtable<Integer, String> table1=new Hashtable<>();
		
		table1.put(1, "Pravin");
		System.out.println("Done");
		System.out.println(table1.put(2, "Ajit"));
		System.out.println("Done 1");
		
		ConcurrentHashMap<Integer,String> cmap=new ConcurrentHashMap<>();
		cmap.put(1, "afsa");
		cmap.put(1, "afsa");		
		Set keySet=table1.entrySet();
		Iterator it=keySet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}