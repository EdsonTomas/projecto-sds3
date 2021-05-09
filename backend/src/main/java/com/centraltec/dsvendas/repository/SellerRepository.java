package com.centraltec.dsvendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.centraltec.dsvendas.entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
