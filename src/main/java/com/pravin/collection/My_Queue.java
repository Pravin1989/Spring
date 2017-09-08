package com.pravin.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import org.hamcrest.core.CombinableMatcher;

public class My_Queue {
	public static void main(String[] args) {
		Queue<String> q=new LinkedList<String>();
		
		q.add("Ankit");
		q.add("Pravin");
		q.add("Amit");
		q.add("Sujit");
		
		System.out.println("Peek : "+q.peek());
//		/System.out.println("Poll : "+q.poll());		
		Iterator it=q.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("===================");
		
		PriorityQueue<String> q1=new PriorityQueue<>();
		q1.add("Sujit");
		q1.add("Pravin");
		q1.add("Ankit");		
		q1.add("Amit");
		System.out.println(q1.element());
		
		Iterator it1=q1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("===================");
		Contact_Comparator cmp=new Contact_Comparator();
		PriorityQueue<Contact> pq=new PriorityQueue<Contact>(10,cmp);
		pq.add(new Contact(1,"Pravin"));
		pq.add(new Contact(1,"Pravin"));
		pq.add(new Contact(1,"Pravin"));
		
		Iterator<Contact> it3=pq.iterator();
		while(it3.hasNext()){
			Contact p=it3.next();
			System.out.println(p.getId());
		}
	}
}