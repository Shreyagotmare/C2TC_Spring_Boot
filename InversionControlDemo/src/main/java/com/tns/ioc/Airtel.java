package com.tns.ioc;

public class Airtel implements Sim
{
	

	public Airtel() {
		System.out.println("I am a Airtel Object...");
	}

	public void calling() 
	{
		System.out.println("Calling Using Airtel sim ...");
	}

	public void data()
	{
		
		System.out.println("Browsing Using Airtel sim ...");
	}

}
