package org.ManagerProject.controller;

import org.ManagerProject.client.RestClient;
import org.ManagerProject.model.Manager;
import org.ManagerProject.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/managerApi")
@CrossOrigin("http://localhost:4200")
public class ManagerApi extends RestClient{
	
	@Autowired
	private ManagerService managerService;
	
	@RequestMapping("/findAll")
	public Iterable<Manager> findAll(){
		return managerService.findAll();
	}
}
