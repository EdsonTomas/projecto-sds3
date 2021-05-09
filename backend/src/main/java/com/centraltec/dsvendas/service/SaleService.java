package com.centraltec.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.repository.SaleRepository;
import com.centraltec.dsvendas.repository.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable ){
		sellerRepository.findAll();
		return 	  repository.findAll(pageable)
							.map(x-> new SaleDTO(x));
							
	}
	
	
	
}
