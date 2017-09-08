package com.pravin.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashCode_Set {
	public static void main(String[] args) {
		Student s1=new Student(1,"Pravin");
		Student s2=new Student(2,"Amit");
		Student s3=new Student(3,"Sujit");
		Student s4=new Student(4,"Kiran");
	
		HashSet<Student> hashStudent=new HashSet<Student>();
		hashStudent.add(s1);
		hashStudent.add(s2);
		hashStudent.add(s3);
		hashStudent.add(s4);
		hashStudent.add(s4);
		System.out.println(hashStudent.add(new Student(2,"Amit")));
		
		System.out.println(hashStudent.size());
		Iterator it=hashStudent.iterator();
		
		while(it.hasNext()){
			Student st=(Student)it.next();
			System.out.println(st.getId()+ " "+st.getName());
		}
		System.out.println("==================================");
		TreeSet<Student> studentSet=new TreeSet<Student>();
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		
		it=studentSet.iterator();
		
		while(it.hasNext()){
			Student st=(Student)it.next();
			System.out.println(st.getId()+ " "+st.getName());
		}				
	}
}