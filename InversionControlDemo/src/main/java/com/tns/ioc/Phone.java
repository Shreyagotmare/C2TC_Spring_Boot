package com.tns.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Phone
{
	public static void main(String[] args)
	{
		//conventional way ------> Hard coding
		/*Airtel a= new Airtel();
		a.calling();
		a.data();
		
		Jio j= new Jio();
		j.calling();
		j.data();*/
		
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml"); // creating for ioc container
		System.out.println("Container Created ...");
		
		Sim s= c.getBean("sim", Sim.class); //Generalizing thing
		s.calling();
		s.data();
		
		
		
		//IOC  Container
		/*Airtel a = c.getBean("airtel", Airtel.class);
		a.calling();
		a.data();
		
		Jio j= c.getBean("jio",Jio.class);
		j.calling();
		j.data();*/
		
	}

}
