package com.in28minutes.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class SomeBusinessTest {

	@Test
	public void calculateSum_basic() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		int sum = someBusinessImpl.calculateSum(new int[] {1,2,3});
		System.out.println("Run");
		int expectedResult = 6;
		assertEquals(expectedResult, sum);
	}
	
	@Test
	public void calculateSum_emptyArray() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		int sum = someBusinessImpl.calculateSum(new int[] { });
		int expectedResult = 0;
		assertEquals(expectedResult, sum);
	}

}
