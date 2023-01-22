package com.in28minutes.unittesting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.unittesting.model.Item;
import com.in28minutes.unittesting.repository.ItemRepository;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository itemRepository;

	public Item retreiveHardCodedItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	public List<Item> getAllItems(){
		 List<Item> list = this.itemRepository.findAll();
		 
		 for(Item item  : list) {
			 item.setValue(item.getPrice() * item.getQuantity());
		 }
		 return list;
	}

}
