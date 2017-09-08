package com.pravin.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Contact c1=new Contact(41,"Pravin");
		Contact c2=new Contact(32,"Amit");
		Contact c3=new Contact(56,"Rohit");
		
		List<Contact> list=new ArrayList<Contact>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println(list.contains(new Contact(32,"Amit")));
		
		Iterator it=list.iterator();
		while(it.hasNext()){
			Contact c=(Contact)it.next();
			System.out.println(c.getId()+" "+c.getName());
		}
		System.out.println("=============================");
		Collections.sort(list,new Contact_Comparator());
		it=list.iterator();
		while(it.hasNext()){
			Contact c=(Contact)it.next();
			System.out.println(c.getId()+" "+c.getName());
		}
		
	}

}
