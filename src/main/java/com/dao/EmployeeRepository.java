package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

//	Optional<Employee> findEmployeeByName(String employeeName);
	
}
