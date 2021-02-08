package com.capgemini.service;

import com.capgemini.model.Employee;

public interface EmployeeService {
	void insertEmployee(Employee emp);

	void deleteEmployeeById(String empid);
}
