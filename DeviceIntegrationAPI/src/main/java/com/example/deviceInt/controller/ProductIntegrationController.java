package com.example.deviceInt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deviceInt.model.ProductIntegration;
import com.example.deviceInt.service.ProductIntegrationService;

@RestController
@RequestMapping("/DeviceInt")
public class ProductIntegrationController{
	
	@Autowired
	private ProductIntegrationService prodIntSvc;
	
	@RequestMapping("/findByDevCode/{deviceCode}")
	public Iterable<ProductIntegration> findbyDeviceCode(@PathVariable("deviceCode") 
	String deviceCode){
		return prodIntSvc.findByDeviceCode(deviceCode);
	}
	
	@RequestMapping("/findByProdCode/{prodCode}")
	public ProductIntegration findbyProdCode(@PathVariable("prodCode") String prodCode) {
		return prodIntSvc.findByProdCode(prodCode);
	}
}
