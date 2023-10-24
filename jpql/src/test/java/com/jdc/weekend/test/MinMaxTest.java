package com.jdc.weekend.test;

import org.junit.jupiter.api.Test;

import com.jdc.weekend.dto.CustomerSaleDate;

public class MinMaxTest extends Main {

	@Test
	void minMaxTest() {
		var jpql = """
				select new com.jdc.weekend.dto.CustomerSaleDate 
				(c.id,c.name,min(s.saleDate),max(s.saleDate)) from 
	 			Sale s join s.customer c group by c.id,c.name 
				order by c.name
				""";
		
		var query = em.createQuery(jpql,CustomerSaleDate.class);
		var result = query.getResultList();
		
		System.out.println(result);
		
	}
	
}
