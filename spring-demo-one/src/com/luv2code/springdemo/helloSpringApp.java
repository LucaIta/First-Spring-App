package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloSpringApp {

	public static void main(String[] args) {

		// create container / load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from container
		Coach myCoach = context.getBean("myCoach", Coach.class);
			
		// run method on bean
		System.out.println(myCoach.GetDailyWorkout());
		
		// run dependency method on bean 
		System.out.println(myCoach.GetDailyFortune());
		
		// close context
		context.close();
	}

}