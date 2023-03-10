package co.ramirolynch.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("----------------------------------------------------------");
		
		int noOfBeans = context.getBeanDefinitionCount();
		System.out.println("no of beans configured = " + noOfBeans);
		System.out.println();
		
		System.out.println("bean names are =========>  ");
		String[]beanNames = context.getBeanDefinitionNames();
		
		for(String beanName:beanNames) {
			System.out.println("\t---------> " + beanName);
		}
		

	}

}
