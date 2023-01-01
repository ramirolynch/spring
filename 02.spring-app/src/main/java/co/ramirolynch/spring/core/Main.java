package co.ramirolynch.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ramirolynch.spring.core.beans.User;

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
		
		User usr1 = (User)context.getBean("user1");
		System.out.println(usr1);
		System.out.println("----------------------------------------------------------");
		
		User usr2 = (User)context.getBean("user1");
		System.out.println(usr2);
		System.out.println("----------------------------------------------------------");
		
		User usr3 = (User)context.getBean("user1");
		System.out.println(usr3);
		System.out.println("----------------------------------------------------------");
		
		User usr4 = context.getBean("user2", User.class);
		System.out.println(usr4);
		

	}

}
