package com.example.deviceInt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.deviceInt.model.ResultInvestigationsDevice;

@Repository
public interface ResultInvestigationsDeviceRepository extends CrudRepository<ResultInvestigationsDevice , Integer>{
	
	Iterable<ResultInvestigationsDevice> findByorderId(Integer id);
}
