package com.capgemini.query.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.query.beans.Employee;
import com.capgemini.query.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/employee/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable String empId)
	{
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/employeebyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name)
	{
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/employeebysalrange/{lower}/{higher}")
	public List<Employee> getEmployeeBySalaryRange(@PathVariable double lower,@PathVariable double higher)
	{
		return employeeService.getEmployeesBySalRange(lower, higher);
	}
	
	@GetMapping("/employeebydesignation/{designation}")
	public List<Employee> getEmployeeByDesignation(@PathVariable String designation)
	{
		return employeeService.getEmployeeByDesignation(designation);
	}
	
	
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@PutMapping("/employee/{empId}")
	public void updateEmployee(@RequestBody Employee employee,@PathVariable String empId)
	{
		employeeService.updateEmployee(empId, employee);
	}
	
	@DeleteMapping("/employee/{empId}")
	public void deleteEmployee(@PathVariable String empId)
	{
		employeeService.deleteEmployee(empId);
	}

}