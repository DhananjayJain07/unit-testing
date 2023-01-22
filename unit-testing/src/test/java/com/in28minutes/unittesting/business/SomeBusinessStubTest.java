package com.in28minutes.unittesting.business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.unittesting.data.SomeDataService;

class SomeDataSeviceStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {1,2,3};
	}
	
}

class SomeDataSeviceEmptyStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] { };
	}
	
}

public class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		someBusinessImpl.setSomeDataService(new SomeDataSeviceStub());
		int actualResult = someBusinessImpl.calculateUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_emptyArray() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl();
		someBusinessImpl.setSomeDataService(new SomeDataSeviceEmptyStub());
		int actualResult = someBusinessImpl.calculateUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

}
