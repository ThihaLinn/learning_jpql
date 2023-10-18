package com.jdc.weekend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String phone;
	@Column(nullable = false)
	private String email;
	@PrimaryKeyJoinColumn
	@MapsId("id")
	@OneToOne(optional = false)
	private Address address;
	
//	@OneToMany
//	private List<Sale> sale;
	
	
}
