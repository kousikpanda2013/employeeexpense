package com.demo.employeeexpense.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employeeexpense.model.Employee;
import com.demo.employeeexpense.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	// To validate employee id is exist or not
	@GetMapping("api/employee/validate/{employeeId}")
	public HashMap<String, Object> findEmployeeByEmpId(@PathVariable final int employeeId) {

		final Employee employee = empService.getEmployeeById(employeeId);

		final HashMap<String, Object> map = new HashMap<>();
		map.put("employeeId", employeeId);
		if (employee != null) {
			map.put("message", "This employee id exist");
			map.put("isValid", true);
		} else {
			map.put("message", "This employee id doesn't exist");
			map.put("isValid", false);
		}
		return map;
	}

}
