package com.in28minutes.unittesting.business;

import java.util.Arrays;
import java.util.OptionalInt;

import com.in28minutes.unittesting.data.SomeDataService;

public class SomeBusinessImpl {
	
	private SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}

	public int calculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);
		/*int sum =0;
		for(int value: data) {
			sum += value;
		}
		return sum;*/
	}
	
	public int calculateUsingDataService() {
		int sum =0;
		int[] data = someDataService.retrieveAllData();
		for(int value: data) {
			sum += value;
		}
		return sum;
	}

}
