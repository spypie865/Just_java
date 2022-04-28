package com.springboot.ems.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.springboot.ems.entities.Employee;
import com.springboot.ems.repository.EmployeeRepository;
import com.springboot.ems.service.impl.EmployeeService;

@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	
	@MockBean
	private EmployeeRepository employeeRepository;
	

	@Test
	public void testSaveEmployee()
	{
		Employee employee=new Employee(101, "rajiv", "shukla", "rajiv@gmail.com");
		Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
		assertThat(employeeService.saveEmployee(employee)).isEqualTo(employee);
		
	}
	
	@Test
	public void testGetAllEmployee()
	{
		
		Employee emp1=new Employee(101, "priya", "sharma", "priya@gmail.com");
		Employee emp2=new Employee(102, "riya", "chatterjee", "riya@gmail.com");
		List<Employee> emplist=new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		
		Mockito.when(employeeRepository.findAll()).thenReturn(emplist);
		assertThat(employeeService.getAllEmployees()).isEqualTo(emplist);
	}
	
	@Test
	public void testDeleteEmployee()
	{
		Optional<Employee> emp = Optional.of(new Employee(103,"raj","das","raj@gmail.com"));
		Mockito.when(employeeRepository.findById(103l)).thenReturn(emp);
		Mockito.when(employeeRepository.existsById(emp.get().getId())).thenReturn(false);
		assertThat(employeeRepository.existsById(emp.get().getId()));
		
}
	
	@Test
	public void testUpdateEmployee()
	{
		Optional<Employee> emp1 = Optional.of(new Employee(103,"raj","das","raj@gmail.com"));
		Employee emp=emp1.get();
		Mockito.when(employeeRepository.findById(103l)).thenReturn(emp1);
		emp.setEmail("raj.da@gmail.com");
		Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
		assertThat(employeeService.updateEmployee(emp, 103l)).isEqualTo(emp);
	}
	
}
