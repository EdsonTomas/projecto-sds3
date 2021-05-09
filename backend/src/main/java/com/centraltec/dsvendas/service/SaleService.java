package com.centraltec.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.centraltec.dsvendas.dto.SaleDTO;
import com.centraltec.dsvendas.dto.SaleSuccessDTO;
import com.centraltec.dsvendas.dto.SaleSumDTO;
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
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupBySeller(){
		return repository.amountGroupBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupBySeller(){
		return repository.successGroupBySeller();
	}
	
}
