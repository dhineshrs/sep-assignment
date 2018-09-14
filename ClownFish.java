package com.xyz.solution;

public class ClownFish extends Fish {

	Swim swim = new Swim("ClownFish");

	public Swim getSwim() {
		return swim;
	}
	
	public void swim() {
		swim.swim();
	}
	
	public void size() {
		System.out.println("I am ClownFish. Size is small");

	}

	public void color() {
		System.out.println("I am ClownFish. My Color is Orange");

	}
	public void joke() {
		System.out.println("I am ClownFish. I can joke");

	}
	

}
