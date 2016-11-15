package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}
	
	@Override
	public String GetDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String GetDailyFortune() {
		return fortuneService.getFortune();
	}

}
