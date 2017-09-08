package com.pravin.collection;

public class Contact {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Contact() {
		
	}
	public Contact(int id,String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public boolean equals(Object arg0) {
		Contact c=(Contact)arg0;
	 return this.id==c.getId();
	}
	@Override
	public int hashCode() {		
		return 10;
	}
}
