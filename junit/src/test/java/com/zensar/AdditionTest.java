package com.zensar;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AdditionTest {

	Addition addition;
	
	@Test
	public void testAdd() {
		
		int add=addition.add(10, 20);
		System.out.println("testAdd"+add);
		assertEquals(30, add);
	}

	@Test
	public void testSub() {
		
		int sub=addition.sub(10, 20);
		System.out.println("testSub"+sub);
		assertEquals(-10, sub);
	}
	
	@Before
	public void additionObjStart() {
		System.out.println("additionObjStart");
		addition=new Addition();
	}
	
	@After
	public void additionObjEnd() {
		System.out.println("additionObjEnd");
		addition=null;
	}
	
}
