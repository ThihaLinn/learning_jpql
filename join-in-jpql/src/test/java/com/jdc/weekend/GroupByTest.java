package com.jdc.weekend;

import org.junit.jupiter.api.Test;

import com.jdc.weekend.dto.CategoryCountDto;

public class GroupByTest extends AbstractTest {

	@Test
	void groupByTest() {
		var jpql = """
				select new com.jdc.weekend.dto.CategoryCountDto
				(c.name,count(p.id)) from Product p 
				join p.category c group by c.name
				""";
		var query = em.createQuery(jpql,CategoryCountDto.class);
		//query.setParameter("name", "Drinks");
		var result = query.getResultList();
		System.out.println(result);
	}
	
}
