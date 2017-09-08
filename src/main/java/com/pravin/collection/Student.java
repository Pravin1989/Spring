package com.pravin.collection;

public class Student implements Comparable<Student> {

	private String name;
	private int id;

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

	public Student(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!(obj instanceof Student)) {
			return false;
		}

		Student p = (Student) obj;
		return p.id == this.id && p.name.equals(this.name);
	}

	@Override
	public int hashCode() {
		return this.id * 10 * this.name.length() / 2;
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}
}