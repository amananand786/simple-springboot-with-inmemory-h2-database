package com.example.testproj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.testproj.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	List<Employee> findByDept(String department);
}
