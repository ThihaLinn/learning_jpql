package com.jdc.weekend.test;

import org.junit.jupiter.api.Test;

import com.jdc.weekend.dto.TotalProductCountByTownship;

public class SumTest extends Main{

	@Test
	void sumTest(){
		var jpql = """
				select new com.jdc.weekend.dto.TotalProductCountByTownship 
				(t.id,t.name,p.name,sum(ps.quantity)) from ProductSale ps join
				ps.product p join ps.sale s
				join s.customer.address.township t
				group by t.id,t.name,p.name order by t.name,p.name
				""";
		var query = em.createQuery(jpql,TotalProductCountByTownship.class);
		var result = query.getResultStream();
		
		result.forEach(System.out::println);
		
	}
	
}
