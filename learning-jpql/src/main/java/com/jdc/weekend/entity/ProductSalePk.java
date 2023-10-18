package com.jdc.weekend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class ProductSalePk {

	@Column(name = "product_id")
	private int productId;
	@Column(name = "sale_id")
	private int saleId;
	
	
	
}
