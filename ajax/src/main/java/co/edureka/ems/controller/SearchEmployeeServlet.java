package co.edureka.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;


public class SearchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeService empService;
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-beans.xml");
		empService = (EmployeeService) context.getBean("emp-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String empno = request.getParameter("eno");
		int eno = Integer.parseInt(empno);
		
		Employee emp = empService.getEmployeeByNo(eno);
		
		if(emp != null) {
			String name = emp.getEmployeeName();
			float sal = emp.getEmployeeSal();
			
			response.setContentType("application/json");
			
			JSONObject jsonEmp = new JSONObject();
			jsonEmp.put("ename", name);
			jsonEmp.put("esal", sal);
			
			out.print(jsonEmp);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
