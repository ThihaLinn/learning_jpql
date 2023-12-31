package com.jdc.weekend.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeEach
	void init() {
		emf =Persistence.createEntityManagerFactory("JPQL");
		em = emf.createEntityManager();
	}
	
	@AfterEach()
	void close() {
		if(emf.isOpen() || emf!=null) {
			emf.close();
		}
	}
}
