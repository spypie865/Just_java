package com.springboot.ems.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.springboot.ems.entities.Employee;

public interface EmployeeService {
  Employee saveEmployee(Employee employee);
  List<Employee> getAllEmployees();
  Employee getEmployeeById(long id);
  Employee updateEmployee(Employee employee,long id);
  void deleteEmployee(long id);
  
  List<Employee> getAllEmployeeByFirstName(String firstName);
  Employee getEmployeeByEmail(String email);	
}
