package com.jdc.weekend.dto;

public record TotalProductCountByTownship(
		long id,
		String township,
		String product,
		Long total
		) {

}
