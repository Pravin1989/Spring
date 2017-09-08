package com.pravin.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author pravin.budage
 *
 */
public class HashCode_Map {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Person,String> map=new HashMap<Person,String>();
		
		Person p1=new Person(1,"Pravin",28);
		Person p2=new Person(2,"Amit",27);
		Person p3=new Person(3,"Sujit",29);
		Person p4=new Person(4,"Kedar",31);
		
		
		/*map.put(p1,"A");
		map.put(p2,"B");
		map.put(p3,"C");
		map.put(p4,"D");*/
		map.put(p1,"B");
		map.put(p2,"C");
		map.put(p3,"D");
		System.out.println(map.size());
		System.out.println(map.get(p3));
		System.out.println(map.get(new Person(1,"Pravin",28)));
		Set set=map.keySet();
		Iterator it=set.iterator();
		
		while(it.hasNext()){
			Person p=(Person)it.next();			
			System.out.println(map.get(p));
		}
		System.out.println((Integer.MAX_VALUE+" "+Integer.MAX_VALUE));
		/*System.out.println("=====================");
		
		TreeMap<Person, String> tmap=new TreeMap<Person,String>();
		tmap.put(p1,"A");
		tmap.put(p2,"B");
		tmap.put(p3,"C");
		
		set=tmap.keySet();
		it=set.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(map.get(p));
		}
		System.out.println("="+tmap.get(p1));*/
	}
}