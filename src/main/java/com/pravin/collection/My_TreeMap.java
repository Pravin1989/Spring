package com.pravin.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class My_TreeMap {
	public static void main(String[] args) {
		NavigableMap<Person, String> tmap = new TreeMap<>();

		tmap.put(new Person(1, "DJ", 11), "Manisha");
		tmap.put(new Person(3, "Pravin", 12), "Shital");
		tmap.put(new Person(0, "Suresh", 13), "Rani");
		tmap.put(new Person(0, "Pravin", 11), "Chiu");

		System.out.println(tmap.size());
		System.out.println(tmap.get(new Person(1, "Pravin", 11)));
		// 1
		Set<Person> set = tmap.keySet();
		Iterator<Person> it = set.iterator();

		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(tmap.get(p));
		}
		System.out.println("1 : ==============");
		// 2

		for (Person p : tmap.keySet()) {
			System.out.println(tmap.get(p));
		}
		System.out.println("2 : ==============");
		// 3

		Set<Map.Entry<Person, String>> strSet = tmap.entrySet();
		for (Entry e : strSet) {
			Person p = (Person) e.getKey();
			System.out.println(p.getId() + " " + e.getValue());
		}
		System.out.println("3 : ==============");
		// 4
		Set<Map.Entry<Person, String>> entrySet = tmap.entrySet();
		Iterator<Entry<Person,String>> it1 = entrySet.iterator();
		while (it1.hasNext()) {
			Entry p =it1.next();
			System.out.println(p.getKey() + " " + tmap.get(p.getKey()));
		}
	}
}