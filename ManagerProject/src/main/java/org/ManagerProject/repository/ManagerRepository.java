package org.ManagerProject.repository;

import java.util.Optional;

import org.ManagerProject.model.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface ManagerRepository extends CrudRepository<Manager, Integer> {
public interface ManagerRepository extends CrudRepository<Manager, String> {

	Optional<Manager> findByid(String id);

	void deleteByid(String id);
}
