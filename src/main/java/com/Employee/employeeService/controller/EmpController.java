package com.Employee.employeeService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	@RequestMapping("/employees")
	public String getEmployeeList() {
		return "List of Employees";
	}

}
