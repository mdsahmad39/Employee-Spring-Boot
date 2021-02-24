package com.myproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DepartmentDao;
import com.dto.Department;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentDao departmentDao;

	@RequestMapping("/registerDepartment")
	public void register() {
		Department d1 = new Department();
		d1.setDepartmentName("IT");
		d1.setDepartmentLocation("HYD");
		
		Department d2 = new Department();
		d2.setDepartmentName("HR");
		d2.setDepartmentLocation("VZG");
		
		departmentDao.register(d1);
		departmentDao.register(d2);
	}
	
	@RequestMapping("/getAllDepartments")
	public List<Department> getAllDepartments(){
		return departmentDao.getAllDepartments();
	}
}
