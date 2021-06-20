package com.demo.employeeexpense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeexpense.model.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

	Employee findByEmployeeId(int employeeId);

}
