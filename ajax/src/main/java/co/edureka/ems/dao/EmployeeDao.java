package co.edureka.ems.dao;


import co.edureka.ems.dto.Employee;

public interface EmployeeDao {
	Employee findEmployeeByNo(Integer eno);
}
