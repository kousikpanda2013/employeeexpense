package com.demo.employeeexpense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employeeexpense.model.Expenses;
import com.demo.employeeexpense.repository.EmployeeExpensesRepository;

@Service
public class EmployeeExpensesService {

	@Autowired
	private EmployeeExpensesRepository expensesRepository;

	public Expenses submitExpense(final Expenses expense) {
		return expensesRepository.save(expense);
	}

	public List<Expenses> getExpensesByEmployeeId(final int employeeId) {
		return expensesRepository.findByEmployeeId(employeeId);

	}

}
