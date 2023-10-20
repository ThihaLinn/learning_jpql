package com.jdc.weekend.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.weekend.entity.Customer;

public class AllTest extends Main {
	
	@ParameterizedTest
	@CsvSource(value={
		"a,555,1",
		"b,555,1"
	})
	void where_test(String name ,String phone,int count) {
		
		var jpql = "select c from Customer c where name like :name and phone like :phone";
		
		var query = em.createQuery(jpql,Customer.class);
		query.setParameter("name",name.concat("%"));
		query.setParameter("phone",phone.concat("%") );
		
		var result = query.getResultList();
		assertEquals(count, result.size());
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"2023-10-01,2023-10-03,3",
		"2023-10-04,2023-10-10,7",
		"2023-10-11,2023-10-12,0"
	})
	void between_test(LocalDate from,LocalDate to,long count) {
		
		var jpql = "select count(s) from Sale s where s.saleDate between :from and :to";
		
		var query =em.createQuery(jpql,long.class);
		query.setParameter("from",from);
		query.setParameter("to",to);
		
		var result = query.getSingleResult();
		assertEquals(count, result);
		
		
	}
	
}
