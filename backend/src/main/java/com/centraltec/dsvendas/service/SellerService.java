package com.centraltec.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centraltec.dsvendas.dto.SellerDTO;
import com.centraltec.dsvendas.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll(){
		return 	  repository.findAll()
							.stream()
							.map(x-> new SellerDTO(x))
							.collect(Collectors.toList());
	}
	
	
	
}
