package com.centraltec.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleControler {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<List<SaleDTO>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
	
	
}
