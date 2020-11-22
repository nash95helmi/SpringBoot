package com.example.deviceInt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.deviceInt.model.ResultInvestigationsDevice;
import com.example.deviceInt.service.ResultInvestigationsDeviceService;

@RestController
@RequestMapping("/resultDeviceInv")
public class ResultInvestigationsDeviceController {
	
	@Autowired
	private ResultInvestigationsDeviceService resInvDevSvc;
	
	@RequestMapping("/findbyOrderId/{orderId}")
	public Iterable<ResultInvestigationsDevice> findbyOrderId(@PathVariable("orderId") Integer id){
		Iterable<ResultInvestigationsDevice> list = resInvDevSvc.findbyOrderId(id);
		return list;
	}
}
