package com.centraltec.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraltec.dsvendas.entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
