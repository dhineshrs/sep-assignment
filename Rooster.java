package com.xyz.solution;

public class Rooster implements CanSing{

	Sing sing = new Sing("Cock-a-doodle-doo");
	Chicken chicken = new Chicken();

	public void sing() {
		chicken.sing("Cock-a-doodle-doo");
	}

	@Override
	public Sing getSing() {
		return sing;
	}

}
