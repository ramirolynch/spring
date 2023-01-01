package co.ramirolynch.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ramirolynch.spring.core.beans.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println("----------------------------------------------------------");
		
		
		
		User user1= (User)context.getBean("user1");
		System.out.println(user1);
		System.out.println();
		
		User user2= (User)context.getBean("user2");
		System.out.println(user2);
		
		((ConfigurableApplicationContext)context).close();

	}

}
