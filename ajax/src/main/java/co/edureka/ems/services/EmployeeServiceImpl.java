package co.edureka.ems.services;


import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl  implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public Employee getEmployeeByNo(Integer eno) {
		return dao.findEmployeeByNo(eno);
	}

}
