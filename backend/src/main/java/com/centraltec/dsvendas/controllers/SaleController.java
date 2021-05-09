package com.centraltec.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.dto.SaleSuccessDTO;
import com.centraltec.dsvendas.dto.SaleSumDTO;
import com.centraltec.dsvendas.service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		return ResponseEntity.ok(service.findAll(pageable));
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupBySeller(){
		return ResponseEntity.ok(service.amountGroupBySeller());
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupBySeller(){
		return ResponseEntity.ok(service.successGroupBySeller());
	}
}
