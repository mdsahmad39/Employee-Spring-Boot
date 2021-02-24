package com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int employeeId;
	private String employeeName;
	private String employeeGender;
	private Date employeeDoj;
	private double employeeSalary;
	
	@Column(unique = true)
	private String loginId;
	private String password;
	
	public Employee(){}

	public Employee(int employeeId, String employeeName, String employeeGender, Date employeeDoj,
			double employeeSalary, String loginId, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeDoj = employeeDoj;
		this.employeeSalary = employeeSalary;
		this.loginId = loginId;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public Date getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(Date employeeDoj) {
		this.employeeDoj = employeeDoj;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeGender="
				+ employeeGender + ", employeeDoj=" + employeeDoj + ", employeeSalary=" + employeeSalary + ", loginId="
				+ loginId + ", password=" + password + "]";
	}
	
	
	
	
	
//	@ManyToOne
//	@JoinColumn(name = "department_id")
//	Department department;
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

}
