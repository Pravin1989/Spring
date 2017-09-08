package com.pravin.collection;

import java.util.Comparator;

public class Contact_Comparator implements Comparator<Contact> {
	@Override
	public int compare(Contact o1, Contact o2) {
		if (o1.getId() == o2.getId())
			return 0;
		if (o1.getId()>o2.getId())
			return 1;
		else
			return -1;
	//	return o1.getName().compareTo(o2.getName());
	}
}