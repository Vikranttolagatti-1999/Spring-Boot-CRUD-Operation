package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controller.model.Employee;
import com.example.controller.service.EmployeeService;


@RestController
public class EmployeeController {
	
	public EmployeeService employeeService;
		
		public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

		@PostMapping("/emp")
		public Employee saveEmployee(@RequestBody Employee employee) {
			return employeeService.saveEmp(employee);
		}
		
		@GetMapping
		public List<Employee> listEmployee() {
			return employeeService.getAllEmployee();
		}
		
		@PutMapping
		public Employee updateEmployee(@RequestBody Employee employee)
			{
			
			return employeeService.update(employee);		
		}
		
		@DeleteMapping("/{id}")
		public String deleteEmployee(@PathVariable Long id) {
			return employeeService.deleteEmployeeById(id);
			
		}
		@GetMapping("/{id}")
		public Employee getEmployeeById(@PathVariable Long id) {
			return employeeService.getEmpById(id);
			 
		}
}