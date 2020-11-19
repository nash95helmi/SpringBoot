package org.ManagerProject.repository;

import java.util.Optional;

import org.ManagerProject.model.idMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface IdMasterRepository extends CrudRepository<idMaster, Integer>{
public interface IdMasterRepository extends CrudRepository<idMaster, String>{
	
	Optional<idMaster> findByid(String id);
}
