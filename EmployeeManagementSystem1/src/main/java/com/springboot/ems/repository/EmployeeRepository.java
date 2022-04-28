package com.springboot.ems.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.ems.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	@Query("select e from Employee e where e.firstName=?1")
List<Employee> getAllEmployeeByFirstName(String firstName);
	
@Query("select e from Employee e where e.email=:email")	
Employee getEmployeeByEmail(@Param("email")String email);	


//for testing
Optional<Employee> findByEmail(String email);
}
