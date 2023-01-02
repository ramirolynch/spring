package co.ramirolynch.spring.core;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ramirolynch.spring.core.beans.Hospital;

public class Main {
	
    public static void main(String[] args) {
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
    	
    	Hospital hosp = (Hospital)context.getBean("apollo");
    	
    	System.out.println("Hospital Name ----> "+ hosp.getHospitalName());
    	System.out.println();
    	System.out.println("Departments available: ");
    	
    	Set<String> deptNames = hosp.getDepartments();
    	for(String deptName:deptNames) {
    		System.out.println("\t----> "+deptName);
    	}
    	
    }

}
