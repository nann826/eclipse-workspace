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
		System.out.println("���з���ִ��֮ǰִ��һ��");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("���з���ִ��֮��ִ��һ��");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("ÿ������ִ��ǰִ��һ��");
		calculate.clear();//����
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("ÿ������ִ�к�ִ��һ��");
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


	
	@Test(timeout = 10)//����
	public void testSquareRoot() {
		calculate.squareRoot(2);
		assertEquals(4,calculate.getResult());
	}

}
