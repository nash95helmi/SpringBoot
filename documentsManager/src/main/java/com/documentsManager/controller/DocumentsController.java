package com.documentsManager.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.documentsManager.model.DocMaster;
import com.documentsManager.model.Documents;
import com.documentsManager.repository.DocMasterRepository;
import com.documentsManager.repository.DocumentsRepositoy;

@RestController
@RequestMapping
public class DocumentsController {
	
	@Autowired
	DocumentsRepositoy documentsRepository;
	
	@Autowired
	DocMasterRepository docMasterRepo;
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public Documents addNewApplication(@RequestBody Documents documents) {
		return documentsRepository.save(documents);
	}
	
	@GetMapping(value = "/download/id/{id}")
	public Optional<Documents> download(@PathVariable String id){
		return documentsRepository.findById(id);
	}
	
	@RequestMapping(value = "/delete/id/{id}", method = RequestMethod.DELETE)
	public void deleteDoc(@PathVariable String id) {
		documentsRepository.deleteById(id);
	}
}
