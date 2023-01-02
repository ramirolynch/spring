package co.edureka.ems.services;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployeeByNo(Integer eno);
	
	public Employee getEmployeeByNo(Integer eno);
	
	public void getAllEmployees();
}
