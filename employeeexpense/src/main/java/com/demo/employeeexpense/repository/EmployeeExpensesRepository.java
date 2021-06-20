package com.demo.employeeexpense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.employeeexpense.model.Expenses;

public interface EmployeeExpensesRepository extends JpaRepository<Expenses, Integer> {

	List<Expenses> findByEmployeeId(int employeeId);

}
