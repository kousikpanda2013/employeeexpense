package com.demo.employeeexpense.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employeeexpense.model.Employee;
import com.demo.employeeexpense.repository.EmployeeRespository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRespository employeeRepository;

	public Employee getEmployeeById(final int employeeId) {
		return employeeRepository.findByEmployeeId(employeeId);

	}
}
