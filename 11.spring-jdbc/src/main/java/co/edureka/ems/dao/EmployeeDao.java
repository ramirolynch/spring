package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDao {
	Integer saveEmployee(Employee emp);
	
	Integer updateEmployee(Employee emp);
	
	Integer deleteEmployeeByNo(Integer eno);
	
	Employee findEmployeeByNo(Integer eno);
	
	List<Employee> findAllEmployees();
}
