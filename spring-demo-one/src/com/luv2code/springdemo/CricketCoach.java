package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String emailAddress;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	private String team;
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter method setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method setTeam");
		this.team = team;
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
