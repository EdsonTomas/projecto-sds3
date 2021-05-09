package com.centraltec.dsvendas.dto;

import com.centraltec.dsvendas.entity.Seller;

public class SaleSumDTO {
	private String name;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.name 	= seller.getName();
		this.sum	= sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
