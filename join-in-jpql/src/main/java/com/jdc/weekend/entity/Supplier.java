package com.jdc.weekend.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "supplier")
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	@Column(insertable = false,length = 20,unique = true)
	private String name;
	@Column(nullable = false,length = 20)
	private String phone;
	@Column(nullable = false,length = 40)
	private String email;
	
	@ManyToMany(mappedBy = "supplier")
	private List<Product> product;
	
}
