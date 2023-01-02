package co.ramirolynch.spring.core;

import java.util.List;
import java.util.Map;
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
    	
    	
    	Map<String,String> depts= hosp.getDeptHeads();
    	
    	Set<String> dnames = depts.keySet();
    	
    	for(String dname:dnames) {
    		String hod = depts.get(dname);
    		String output = String.format("%-17s ---> %s", dname,hod);
    		System.out.println(output);
    	}
    	
    }

}
