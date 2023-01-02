package co.edureka.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl  implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
	public void saveEmployee(Employee emp) {
		int n = dao.saveEmployee(emp);
		if(n > 0) {
			System.out.println("$$$--- Employee Saved ---$$$");
		}
	}

	public void updateEmployee(Employee emp) {
		Integer n = dao.updateEmployee(emp);
		if(n > 0)
			System.out.println("$$$--- Employee Updated ---$$$");
	}

	public void deleteEmployeeByNo(Integer eno) {
		Integer n = dao.deleteEmployeeByNo(eno);
		if(n > 0)
			System.out.println("$$$--- Employee Deleted ---$$$");
		else
			System.out.println("@@@--- No Matching Employee to Delete ---@@@");
	}

	public Employee getEmployeeByNo(Integer eno) {
		return dao.findEmployeeByNo(eno);
	}

	public void getAllEmployees() {
		List<Employee> employees = dao.findAllEmployees();
		for(Employee emp : employees) {
			System.out.println(emp);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
