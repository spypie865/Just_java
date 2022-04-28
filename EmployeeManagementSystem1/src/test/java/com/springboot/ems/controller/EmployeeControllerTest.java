package com.springboot.ems.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import com.springboot.ems.entities.Employee;
import com.springboot.ems.service.impl.EmployeeService;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	private Employee employee;
	@MockBean
	private EmployeeService employeeService;
	
	
	@BeforeEach
	void setup() {
		employee = new Employee(101,"ram","dutta","ram@gmail.com");
	}
	
	@Test
	public  void testsaveEmployee() throws Exception{
		
		Employee emp=new Employee(101,"ram","dutta","ram@gmail.com");
		Mockito.when(employeeService.saveEmployee(emp)).thenReturn(employee);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/employee/").contentType(MediaType.APPLICATION_JSON)
				.content("{\r\n" + "  \"id\": 101,\r\n" + "  \"firstName\": \"ram\",\r\n" + "  \"lastName\": dutta,\r\n"
						+ "  \"email\": \"ram@gmail.com\"\r\n" + "}"))
				.andExpect(MockMvcResultMatchers.status().isOk());	
		
		
	}
	
	
	
}
