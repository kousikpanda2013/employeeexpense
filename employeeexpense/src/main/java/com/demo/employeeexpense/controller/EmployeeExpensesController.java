package com.demo.employeeexpense.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employeeexpense.model.Employee;
import com.demo.employeeexpense.model.Expenses;
import com.demo.employeeexpense.service.EmployeeExpensesService;
import com.demo.employeeexpense.service.EmployeeService;

@RestController
public class EmployeeExpensesController {

	@Autowired
	private EmployeeExpensesService expensesService;

	@Autowired
	EmployeeService empService;

	// For submit expense
	@PostMapping("/api/employee/expenses/expense")
	public HashMap<String, Object> addExpense(@RequestBody final Expenses requestExpense) {
		final Employee employee = empService.getEmployeeById(requestExpense.getEmployeeId());

		final HashMap<String, Object> map = new HashMap<>();
		if (employee != null) {
			expensesService.submitExpense(requestExpense);

			map.put("isSuccess", true);
			map.put("message", "expense submitted successfully");
		} else {
			map.put("isSuccess", false);
			map.put("message", "employee id does not exist");
		}
		return map;
	}

	// For get expenses list for a employee id
	@GetMapping("api/employee/expenses/expense/{employeeId}")
	public List<Expenses> findExpensesByEmployeeId(@PathVariable final int employeeId) {
		return expensesService.getExpensesByEmployeeId(employeeId);
	}

}
