package com.myproject;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DepartmentDao;
import com.dao.EmployeeDao;
import com.dto.Department;
import com.dto.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Autowired
	DepartmentDao departmentDao;
	
	@RequestMapping("/registerEmployee")
	public void register() {
		List<Department> deptList = departmentDao.getAllDepartments();
		
		Employee emp1 = new Employee(1, "Ajay", "male", new Date("11/12/2021"), 23000, "ajay123", "password");
		Employee emp2 = new Employee(2, "Navjyoth", "male", new Date("11/12/2021"), 23000, "navjyoth123", "password");
		Employee emp3 = new Employee(3, "Abbas", "male", new Date("11/12/2021"), 23000, "abbas123", "password");
		
		
		employeeDao.register(emp1);
		employeeDao.register(emp2);
		employeeDao.register(emp3);
	}
	
	@RequestMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@RequestMapping("/getEmployeeById/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		return employeeDao.getEmployeeById(employeeId);
	}
	
//	@RequestMapping("/getEmployeeByName/{employeeName}")
//	public Employee getEmployeeByName(@PathVariable("employeeName") String employeeName) {
//		return employeeDao.getEmployeeByName(employeeName);
//	}

}
