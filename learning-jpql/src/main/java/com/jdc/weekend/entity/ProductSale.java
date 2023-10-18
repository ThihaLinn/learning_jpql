package com.jdc.weekend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Data;

@Data
@Entity
public class ProductSale {

	@EmbeddedId
	private ProductSalePk id;
	
	@MapsId("productId")
	@ManyToOne
	private Product product;
	@MapsId("saleId")
	@ManyToOne
	private Sale sale;
	@Column(nullable = false)
	private int quantity;
	
	
}
