package com.example.deviceInt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.deviceInt.model.ResultInvestigationsDevice;
import com.example.deviceInt.repository.ResultInvestigationsDeviceRepository;

@Service
public class ResultInvestigationsDeviceService {
	
	@Autowired
	private ResultInvestigationsDeviceRepository resultInvDeviceRepo;
	
	public Iterable<ResultInvestigationsDevice> findbyOrderId(Integer id){
		Iterable<ResultInvestigationsDevice> resList = resultInvDeviceRepo.findByorderId(id);
		for(ResultInvestigationsDevice res : resList) {
			System.out.println(res.getResultJson().replace("\\\"", "\""));
			res.setResultJson(res.getResultJson().replace("\\\"", "\""));
		}
		return resList;
	}
}
