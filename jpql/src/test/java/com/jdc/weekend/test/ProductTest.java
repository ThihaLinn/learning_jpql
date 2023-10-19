package com.jdc.weekend.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.weekend.entity.Customer;

public class ProductTest extends Main {
	
	@ParameterizedTest
	@CsvSource(value={
		"a,555,1",
		"b,555,1"
	})
	void test(String name ,String phone,int count) {
		
		var jpql = "select c from Customer c where name like :name and phone like :phone";
		
		var query = em.createQuery(jpql,Customer.class);
		query.setParameter("name",name.concat("%"));
		query.setParameter("phone",phone.concat("%") );
		
		var result = query.getResultList();
		assertEquals(count, result.size());
		
	}
	
}
