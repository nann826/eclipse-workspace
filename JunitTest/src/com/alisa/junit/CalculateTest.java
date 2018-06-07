package com.alisa.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculateTest {
	
	Calculate calculate = new Calculate();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("所有方法执行之前执行一遍");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("所有方法执行之后执行一遍");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("每个方法执行前执行一遍");
		calculate.clear();//清零
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("每个方法执行后执行一遍");
	}

	@Test
	public void testAdd() {
		calculate.add(3);
		calculate.add(4);
		assertEquals(7,calculate.getResult());
	}

	@Test
	public void testSubtract() {
		calculate.subtract(8);
		calculate.subtract(3);
		assertEquals(5,calculate.getResult());
	}
	
	@Ignore("ignore multiply method")
	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		calculate.add(8);
		calculate.divide(2);
		assertEquals(4,calculate.getResult());
	}
		
	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		calculate.divide(0);
	}


	
	@Test(timeout = 10)//报错
	public void testSquareRoot() {
		calculate.squareRoot(2);
		assertEquals(4,calculate.getResult());
	}

}
