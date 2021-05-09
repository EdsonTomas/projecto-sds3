package com.centraltec.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.dto.SellerDTO;
import com.centraltec.dsvendas.service.SaleService;
import com.centraltec.dsvendas.service.SellerService;

@RestController
@RequestMapping(value="/sellers")
public class SellerControler {

	@Autowired
	private SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	
}
