package com.centraltec.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.repository.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<SaleDTO> findAll(){
		return 	  repository.findAll()
							.stream()
							.map(x-> new SaleDTO(x))
							.collect(Collectors.toList());
	}
	
	
	
}
