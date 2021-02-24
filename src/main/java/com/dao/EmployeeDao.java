package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Employee;

@Service
public class EmployeeDao {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public void register(Employee employee) {
		employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(Integer employeeId) {
		return employeeRepository.findById(employeeId).orElse(new Employee());
	}

//	public Employee getEmployeeByName(String employeeName) {
//		return employeeRepository.findEmployeeByName(employeeName).orElse(new Employee());
//	}

}
