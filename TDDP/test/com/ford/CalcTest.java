package com.ford;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {
	
	static Calc obj;
	
	@BeforeEach
	public void setup() {

		obj=new Calc();
	}
	
	
	@Test
	void testAdd() {
		
		int result=obj.add(5,8);
		assertEquals(13, result);
		
	}
	
	@Test
	void testAddwithNegative() {
		int result=obj.add(5, -10);
		assertEquals(-5, result);
		
	}
}
