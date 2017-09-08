package com.pravin.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class My_TreeSet {
	public static void main(String[] args) {		
		Contact_Comparator cmp=new Contact_Comparator();

		//TreeMap with Comparator
		TreeSet<Contact> tset1=new TreeSet<>(cmp);
		tset1.add(new Contact(4, "Pravin"));
		tset1.add(new Contact(2, "Pravin"));
		System.out.println("Size : "+tset1.size());
		Iterator<Contact> it=tset1.iterator();
		while(it.hasNext()){
			Contact c=it.next();
			System.out.println(c.getId()+" "+c.getName());
		}
		
		//TreeMap with Comparable
		TreeSet<Person> tset=new TreeSet<>();
		tset.add(new Person(1,"Pravin",23));
		tset.add(new Person(2,"Pravin",25));
		System.out.println(tset.add(new Person(3,"Pravin",24)));			
		System.out.println(tset.size());
	}
}