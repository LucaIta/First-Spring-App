package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	int[] myIntArray = {1,2,3};
	String[] fortuneServiceArray = {"Today is your lucky day!","Today is not your lucky day!","Today will be avarage for you!"};

	@Override
	public String getFortune() {
	    int rnd = new Random().nextInt(fortuneServiceArray.length);
		return fortuneServiceArray[rnd];
	}

}
