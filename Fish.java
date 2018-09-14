package com.xyz.solution;

public class Fish extends Animal implements CanSwim {

	Swim swim = new Swim("Fish");

	public Swim getSwim() {
		return swim;
	}
	
	public void swim() {
		swim.swim();
	}

}
