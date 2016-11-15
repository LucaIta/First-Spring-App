package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieves bean from the spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		System.out.println(theCoach.GetDailyWorkout());
		
		// close the context
		System.out.println("this is the line before closing the context");
		context.close();
	}

}
