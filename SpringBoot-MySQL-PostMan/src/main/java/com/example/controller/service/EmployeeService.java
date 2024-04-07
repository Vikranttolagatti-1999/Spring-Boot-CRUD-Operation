package com.example.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.model.Employee;
import com.example.controller.repository.EmployeeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeeRepository employeerepository;
	
	public EmployeeService(EmployeeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}
	public Employee saveEmp(Employee emp) {
		return employeerepository.save(emp);
	}
	public Employee getEmpById(Long id) {
		return employeerepository.findById(id).get();	
		}
	public List<Employee> getAllEmployee(){
		return employeerepository.findAll();
	}
	public Employee update(Employee emp) {
		return employeerepository.save(emp);
	}
	public String deleteEmployeeById(Long id) {
		employeerepository.deleteById(id);
		return "deleted "+id;
	}
	
}

