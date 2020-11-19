package org.ManagerProject.repository;

import java.util.Optional;

import org.ManagerProject.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface DepartmentRepository extends CrudRepository<Department, Integer>{
public interface DepartmentRepository extends CrudRepository<Department, String>{
	
	Optional<Department> findBydepartment(String dept);
	Optional<Department> findByid(String deptID);
}
