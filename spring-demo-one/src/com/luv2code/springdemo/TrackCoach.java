package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {
		return "Run an hard 5k";
	}

	@Override
	public String GetDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}
	
	// startupStuff code
	public void doMyStartupStuff() {
		System.out.println("Inside my doMyStartupStuff method");
	}
	
	// cleanUp Code
	public void doMyCleanupStuff() {
		System.out.println("Inside my doMyCleanupStuff method");
	}
	
}
