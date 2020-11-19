package com.documentsManager.repository;

import org.springframework.data.repository.CrudRepository;

import com.documentsManager.model.DocMaster;

public interface DocMasterRepository extends CrudRepository<DocMaster, String>{
	
}
