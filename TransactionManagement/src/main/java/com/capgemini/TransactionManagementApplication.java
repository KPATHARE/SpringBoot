package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.capgemini.model.Employee;
import com.capgemini.model.EmployeeHealthInsurance;
import com.capgemini.service.OrganizationService;

@SpringBootApplication
public class TransactionManagementApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(TransactionManagementApplication.class, args);
		OrganizationService organizationService = context.getBean(OrganizationService.class);

		Employee emp = new Employee();
		emp.setEmpId("emp1");
		emp.setEmpName("emp1");

		EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
		employeeHealthInsurance.setEmpId("emp1");
		employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
		employeeHealthInsurance.setCoverageAmount(20000);

		organizationService.joinOrganization(emp, employeeHealthInsurance);
	}

}
