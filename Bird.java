package com.xyz.solution;

class Bird extends Animal implements CanFly, CanSing {

	Fly fly = new Fly("Bird");
	Sing sing = new Sing("Bird");

	void sing(String message) {
		System.out.println("I am singing.." + message);
	}

	@Override
	public Fly getFly() {
		return fly;
	}

	public void fly() {
		this.fly.fly();
	}

	@Override
	public Sing getSing() {
		return sing;
	}

	public void sing() {
		this.sing.sing();
	}

}
