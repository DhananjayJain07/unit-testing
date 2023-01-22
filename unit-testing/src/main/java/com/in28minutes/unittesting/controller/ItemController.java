package com.in28minutes.unittesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.unittesting.model.Item;
import com.in28minutes.unittesting.service.ItemBusinessService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService itemBusinessService;

	@GetMapping("/dummy-item")
	public Item dummyItem() {
		return new Item(1, "Ball", 10, 100);
	}
	
	@GetMapping("/item-from-business-service")
	public Item itemFromBusinessService() {
		return itemBusinessService.retreiveHardCodedItem();
	}
	
	@GetMapping("/all-items")
	public List<Item> getAllItems(){
		return this.itemBusinessService.getAllItems();
	}
}
