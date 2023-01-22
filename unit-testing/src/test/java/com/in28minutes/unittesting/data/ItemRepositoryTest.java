package com.in28minutes.unittesting.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.unittesting.model.Item;
import com.in28minutes.unittesting.repository.ItemRepository;

@RunWith(SpringRunner.class)// for junit 4 only
@DataJpaTest
public class ItemRepositoryTest {

	@Autowired
	private ItemRepository itemRepository;
	
	@Test
	public void testFindAll() {
		List<Item> items = itemRepository.findAll();
		assertEquals(3, items.size());
	}
}
