package com.springboot.ems.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.ems.controller.EmployeeController;
import com.springboot.ems.entities.Employee;
import com.springboot.ems.exception.ResourceNotFoundException;
import com.springboot.ems.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private static final Logger l=LoggerFactory.getLogger(EmployeeService.class);
	/*
	 * public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	 * 
	 * super(); this.employeeRepository=employeeRepository; }
	 */
	
	
	
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		l.info("Inside servive Layer!!!!" + new java.util.Date());
		return employeeRepository.save(employee);
	}


	
	public List<Employee> getAllEmployees() {
	
		return employeeRepository.findAll();
	}


	
	public Employee getEmployeeById(long id) {
		l.info("Get user by id: ", id);
	Optional<Employee> employee=employeeRepository.findById(id);
		if(employee.isPresent())
		{
			
			return employee.get();
		}
		else
		{
			throw new ResourceNotFoundException("Employee", "ID", id);
		}
		
		
		//lamda Expression
		/*
		 * return employeeRepository.findById(id).orElseThrow(()-> new
		 * ResourceNotFoundException("Employee", "Id", id) );
		 */
	
	}


	
	public Employee updateEmployee(Employee employee, long id) {
		
		//we need to check whether employee with given id is exist in DB or not
		Employee existingemp=employeeRepository.findById(id).orElseThrow(()
		->new ResourceNotFoundException("Employee", "Id", id));
		
		//we are getting data from client and set in existing emp
		existingemp.setFirstName(employee.getFirstName());
		existingemp.setLastName(employee.getLastName());
		existingemp.setEmail(employee.getEmail());
		
		//save existing employee to DB
		employeeRepository.save(existingemp);
		return existingemp;
		
	}


	
	public void deleteEmployee(long id) {
	employeeRepository.findById(id).orElseThrow(()
			->new ResourceNotFoundException("Employee", "Id", id));
	
	employeeRepository.deleteById(id);
		
	}


	
	public List<Employee> getAllEmployeeByFirstName(@PathVariable String firstName) {
	
		return employeeRepository.getAllEmployeeByFirstName(firstName);
	}


	
	public Employee getEmployeeByEmail(String email) {
		
		return employeeRepository.getEmployeeByEmail(email);
	}


	


	

}
