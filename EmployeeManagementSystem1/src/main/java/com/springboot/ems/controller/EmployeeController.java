package com.springboot.ems.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ems.entities.Employee;
import com.springboot.ems.service.impl.EmployeeService;

@RestController
//@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
private EmployeeService employeeService;
	
	private static final Logger logger=LoggerFactory.getLogger(EmployeeController.class);
	
	/*
	 * public EmployeeController(EmployeeService employeeService) {
	 * 
	 * super(); this.employeeService=employeeService; }
	 */
	
	//build create employee REST API
	
	@PostMapping("/api/addemployee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee)
	{
		//return employeeService.saveEmployee(employee);
		logger.info("Employee has been added!!!!" + employee + " done on " + new java.util.Date());
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	//build get all employee REST API
	@GetMapping("/api/getAllEmployee")
    public List<Employee> getAllEmployees()
    {
		logger.info("Employee retrieve successfully");
		//logger.warn("Please check carefully");
    	return employeeService.getAllEmployees();
    }
	
	//build get employee by id REST API
	//http://localhost:8085/api/employees/2
	@GetMapping("/api/getEmpById/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeid)
	{
	return new ResponseEntity<Employee> (employeeService.getEmployeeById(employeeid),HttpStatus.OK);
		
	}
	
//build update employee REST API
	//http://localhost:8085/api/employees/2	
@PutMapping("/api/updateEmpById/{id}")
public ResponseEntity<Employee>	updateEmployee(@Valid @PathVariable("id") long id,
		@RequestBody Employee employee)

{
	return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),
			HttpStatus.OK);
}
	

//build delete employee REST API
//http://localhost:8085/api/employees/2	

@DeleteMapping("/api/deleteEmployeeById/{id}")
public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id)
{
	
employeeService.deleteEmployee(id);
return new ResponseEntity<String>("Employee deleted successfully", HttpStatus.OK);
}



@GetMapping("/getAllEmployeeByFirstName/{firstName}")
public List<Employee> getAllEmployeeByFirstName(@PathVariable String firstName)
{
	return employeeService.getAllEmployeeByFirstName(firstName);
}


@GetMapping("/getEmployeeByemail/{email}")
public Employee getEmployeeByEmail(@PathVariable String email)
{
	return employeeService.getEmployeeByEmail(email);
}
}









