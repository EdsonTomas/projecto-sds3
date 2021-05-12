package com.centraltec.dsvendas.dto;

import com.centraltec.dsvendas.entity.Seller;

public class SaleSumDTO {
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName 	= seller.getName();
		this.sum	= sum;
	}

	public String getName() {
		return sellerName;
	}

	public void setName(String name) {
		this.sellerName = name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
}
