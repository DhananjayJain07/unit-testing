package com.in28minutes.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.in28minutes.unittesting.data.SomeDataService;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	
	@InjectMocks
	SomeBusinessImpl someBusinessImpl;
	
	@Mock
	SomeDataService someDataServiceMock;
	
	
	@Test
	public void calculateSumUsingDataService_basic() {
		
		when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		
		assertEquals(6, someBusinessImpl.calculateUsingDataService());
	}
	
	@Test
	public void calculateSum_emptyArray() {
		
		when(someDataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		assertEquals(0, someBusinessImpl.calculateUsingDataService());
	}

}
