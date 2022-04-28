package com.springboot.ems.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.springboot.ems.entities.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeerepository;

	@Autowired
	private TestEntityManager entityManager;
	
	// junit test for save employee

	@Test
	@Order(1)
	@Rollback(value = false)
	public void saveEmployeeTest() {
		/*Employee employee = new Employee();
		employee.setFirstName("ram");
		employee.setLastName("jadav");
		employee.setEmail("ram@gmail.com");*/
		
		Employee employee=Employee.builder().firstName("ram")
				.lastName("sharma")
				.email("ram@gmail.com").build();

		employeerepository.save(employee);

		assertThat(employee.getId()).isGreaterThan(0);
//assertEquals(23, employee.getId());
	}

	
	@Test
	@Order(2)
	@Rollback(value = false)
	public void getListOfEmployeesTest() {

		List<Employee> employees = employeerepository.findAll();
		assertThat(employees.size()).isGreaterThan(0);

	}

	
	@Test
	@Order(3)
	@Rollback(value = false)
	public void updateEmployeeTest() {
		Employee updateemp = employeerepository.findById(23L).get();
		updateemp.setFirstName("ram");
		Employee empupdated = employeerepository.save(updateemp);
		assertThat(empupdated.getFirstName()).isEqualTo("ram");
	}
	
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void deleteEmployeeTest()
	{
		Employee employee=employeerepository.findById(23l).get();
		employeerepository.delete(employee);
		
		Employee employee1=null;
		
		Optional<Employee> optionalemp=employeerepository.findByEmail("ram@gmail.com");
		
		if(optionalemp.isPresent())
		{
			employee1=optionalemp.get();
		}
		
		assertThat(employee1).isNull();
		
	}
	
	
	
	
	
	
	
	
	/*
	 * @BeforeEach void setup() { Employee emp=new Employee();
	 * emp.setFirstName("ram"); emp.setLastName("otari");
	 * emp.setEmail("ram@gmail.com"); entityManager.persist(emp); }
	 * 
	 * @Test public void findByEmpId() { Employee
	 * employee=employeerepository.findById(5l).get(); assertEquals("ram",
	 * employee.getFirstName()); }
	 */
	
	
	
	
	
	
	
	
	

}
