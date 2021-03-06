package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define a parameter for the dependency
	private FortuneService fortuneService;
	
	// create a constructor which accept the dependency "fortuneService" and which will be used by Spring to inject the dependency
	public BaseballCoach (FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}
	
	
	@Override
	public String GetDailyWorkout() {
		return "Spending 30 minutes in batting practice";
	}

	@Override
	public String GetDailyFortune() {
		// the BaseballCoach can't give daily fortune by himself, depends on the fortuneService (which we can call helper)
		return fortuneService.getFortune();
	}
	
	
}
