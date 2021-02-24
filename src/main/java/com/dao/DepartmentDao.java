package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.Department;

@Service
public class DepartmentDao {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public void register(Department department) {
		departmentRepository.save(department);
	}

	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	
}
