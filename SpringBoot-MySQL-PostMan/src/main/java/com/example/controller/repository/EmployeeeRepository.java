package com.example.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controller.model.Employee;


public interface EmployeeeRepository extends JpaRepository<Employee, Long> {

}
