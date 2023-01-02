package co.ramirolynch.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.ramirolynch.spring.core.beans.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("user-cars-beans.xml");
		
		Customer cust = (Customer)context.getBean("ron");
		System.out.println(cust.getFirstName()+" - "+cust.getLastName()+" owns a "+
		cust.getCar()+ " car which costs USD= "+cust.getCar().getCost());

	}

}
