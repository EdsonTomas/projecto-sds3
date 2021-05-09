package com.centraltec.dsvendas.dto;

import java.time.LocalDate;

import com.centraltec.dsvendas.entity.Sale;

public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	private SellerDTO sellerDto;
	
	public SaleDTO() {
		// TODO Auto-generated constructor stub
	}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.sellerDto = seller;
	}

	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		sellerDto = new SellerDTO(entity.getSeller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSellerDto() {
		return sellerDto;
	}

	public void setSellerDto(SellerDTO sellerDto) {
		this.sellerDto = sellerDto;
	}

	
	

}
