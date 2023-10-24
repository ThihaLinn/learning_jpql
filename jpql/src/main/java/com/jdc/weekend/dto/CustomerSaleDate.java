package com.jdc.weekend.dto;

import java.time.LocalDate;

public record CustomerSaleDate(
		long id,
		String name,
		LocalDate startDate,
		LocalDate lastDate
		) {
		
}
