package com.jdc.weekend;

import org.junit.jupiter.api.Test;

import com.jdc.weekend.dto.SupplierDto;

public class ProjectionTest extends AbstractTest {
	
	@Test
	void prjection() {
		
		var jpql = "select new com.jdc.weekend.dto.SupplierDto(s.id, s.name,s.phone) from Supplier s inner join s.product p where  p.name = ?1";
		var query = em.createQuery(jpql,SupplierDto.class);
		
		query.setParameter(1, "Potato Chips");
		var result = query.getResultList();
		System.out.println(result);
		
	}
	
}
