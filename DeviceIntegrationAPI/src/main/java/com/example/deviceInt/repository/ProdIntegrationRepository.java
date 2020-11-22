package com.example.deviceInt.repository;

import org.springframework.stereotype.Repository;

import com.example.deviceInt.model.ProductIntegration;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProdIntegrationRepository extends CrudRepository<ProductIntegration , String>{
	
	Optional<ProductIntegration> findByproductCode(String prodCode);
	
	Iterable<ProductIntegration> findByintegrationDeviceCode(String deviceCode);
}
