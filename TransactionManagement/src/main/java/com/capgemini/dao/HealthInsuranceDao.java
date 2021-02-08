package com.capgemini.dao;
import com.capgemini.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
	void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance);

	void deleteEmployeeHealthInsuranceById(String empid);

}
