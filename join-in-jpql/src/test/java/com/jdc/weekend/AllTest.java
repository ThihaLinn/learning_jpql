package com.jdc.weekend;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.weekend.entity.Category;
import com.jdc.weekend.entity.Product;

@TestMethodOrder(OrderAnnotation.class)
public class AllTest extends AbstractTest {

	@Test
	@Order(1)
	void many_to_one_test() {
		var data = em.find(Product.class, 3);
		System.out.println(data.getCategory().getName());
	}
	@Test
	@Order(2)
	void one_to_one_test() {
		var data = em.find(Category.class, 1);
		System.out.println(data.getName());
		
		data.getProduct().stream().map(p -> p.getName())
		.forEach(System.out::println);
	}
	
}
