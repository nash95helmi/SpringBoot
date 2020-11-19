package org.ManagerProject.repository;

import java.util.Optional;

import org.ManagerProject.model.DocMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface DocMasterRepository extends CrudRepository<DocMaster, Integer>{
public interface DocMasterRepository extends CrudRepository<DocMaster, String>{	
	Optional<DocMaster> findByid(String id);
	void deleteByid(String managerID);
}
