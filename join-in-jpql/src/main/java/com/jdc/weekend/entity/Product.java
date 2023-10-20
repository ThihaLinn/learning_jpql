package com.jdc.weekend.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false,length = 20,unique = true)
	private String name;
	@ManyToOne(optional = true)
	private Category category;
	
	@ManyToMany
	@JoinTable(name = "product_supply", joinColumns = @JoinColumn(name = "product_id"))
   
	private List<Supplier> supplier;
	
	
}
