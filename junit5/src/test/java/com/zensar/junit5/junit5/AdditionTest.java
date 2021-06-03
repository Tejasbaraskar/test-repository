package com.zensar.junit5.junit5;




import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdditionTest {

	Addition addition;
	
	@Test
	public void testAdd() {
		
		int add=addition.add(10, 20);
		System.out.println("testAdd"+add);
		Assertions.assertEquals(30, add);
	}

	@Test
	public void testSub() {
		
		int sub=addition.sub(10, 20);
		System.out.println("testSub"+sub);
		Assertions.assertEquals(-10, sub);
	}
	
	@BeforeEach
	public void additionObjStart() {
		System.out.println("additionObjStart");
		addition=new Addition();
	}
	
	@AfterEach
	public void additionObjEnd() {
		System.out.println("additionObjEnd");
		addition=null;
	}
	
}
