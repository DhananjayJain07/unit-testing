package com.in28minutes.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.in28minutes.unittesting.data.SomeDataService;
import com.in28minutes.unittesting.model.Item;
import com.in28minutes.unittesting.repository.ItemRepository;
import com.in28minutes.unittesting.service.ItemBusinessService;


@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {
	
	
	@InjectMocks
	private ItemBusinessService itemBusinessService;
	
	@Mock
	private ItemRepository itemRepository;
	
	
	@Test
	public void getAllItems_Basic() {
		
		when(itemRepository.findAll()).thenReturn(Arrays.asList(new Item(2, "Item2", 10, 12),
				new Item(3, "Item3", 20, 20)));
		
		List<Item> items = itemBusinessService.getAllItems();
		assertEquals(120,items.get(0).getValue());
		assertEquals(400,items.get(1).getValue());
	}
	

}
