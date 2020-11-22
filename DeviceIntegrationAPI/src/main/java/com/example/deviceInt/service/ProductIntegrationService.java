package com.example.deviceInt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deviceInt.model.ProductIntegration;
import com.example.deviceInt.repository.ProdIntegrationRepository;

@Service
public class ProductIntegrationService {
	
	@Autowired
	private ProdIntegrationRepository prodIntRepo;
	
	public Iterable<ProductIntegration> findByDeviceCode(String deviceCode) {
		Iterable<ProductIntegration> prodIntList = prodIntRepo.findByintegrationDeviceCode(deviceCode);
		return prodIntList;
	}
	
	public ProductIntegration findByProdCode(String prodCode){
		ProductIntegration prodObj = null;
		Optional<ProductIntegration> prod = prodIntRepo.findByproductCode(prodCode);
		prodObj = prod != null ? prod.get() : prodObj;
		return prodObj;
	}
}
