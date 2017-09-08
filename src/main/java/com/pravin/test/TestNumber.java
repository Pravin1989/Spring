package com.pravin.test;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.pravin.collection.Calculator;

public class TestNumber extends TestCase {
	int a, b;
	Calculator c=new Calculator();

	@Before
	public void setUp() throws Exception {
		a = 10;
		b = 20;
	}

	@Test
	public void test() {
		assertEquals(30, c.calculateAddition(a, b));		
	}
	
}