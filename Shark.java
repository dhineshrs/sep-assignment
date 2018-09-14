package com.xyz.solution;

public class Shark extends Fish {
	
	Swim swim = new Swim("Shark");

	public Swim getSwim() {
		return swim;
	}
	
	public void swim() {
		swim.swim();
	}

	public void size() {
		System.out.println("I am Shark. Size is Large");

	}

	public void color() {
		System.out.println("I am Shark. My Color is Grey");

	}
	public void eat() {
		System.out.println("I am Shark. I can eat fish");

	}
	

}
