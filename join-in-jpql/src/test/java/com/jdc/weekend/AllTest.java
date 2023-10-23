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
	
	@Test
	@Order(3)
	void join_to_one_test() {
		var jpql ="select p from Product p where p.category.name = :name";
		var query = em.createQuery(jpql,Product.class);
		query.setParameter("name","Drinks" );
		
		var result = query.getResultList();
		
		result.stream().map(Product::getName).forEach(System.out::println);
		
	}
	
	@Test
	@Order(4)
	void join_to_many_test() {
		var jpql = "select p from Product p join p.supplier s where s.name = :name";
		var query = em.createQuery(jpql,Product.class);
		
		query.setParameter("name", "Star shop");
		var result = query.getResultStream();
		result.map(p -> p.getName()).forEach(System.out::println);
		
		
	}
	
	
}
