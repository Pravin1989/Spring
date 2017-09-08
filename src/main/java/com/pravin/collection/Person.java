package com.pravin.collection;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	private int age;
	private String name;
	private int id;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person(int id, String name, int age) {
		this.age = age;
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person) obj;
		return p.id == this.id && p.name.equals(this.name) && p.age == this.age;
		
	}

	@Override
	public int hashCode() {
		//return this.id * 10 * this.name.length() / 2;
		return 10;
	}
	public Person() {
		
	}

	@Override
	public int compareTo(Person o) {
		if(this.id==o.id){
			return 0;
		}
		if(this.id> o.id){
			return 1;
		}else{
			return -1;
		}
		//return this.name.compareTo(o.name);
	}	
}