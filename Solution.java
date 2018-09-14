package com.xyz.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	static void checkWalkAnimal() {
		Animal animal = new Animal();
		animal.walk();
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.getWalk();
	}

	static void checkBirds() {
	
		
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();

		Duck duck = new Duck();
		duck.sing();
		duck.swim();

		Bird chicken = new Chicken();
		chicken.sing();

		Rooster rooster = new Rooster();
		rooster.sing();

		ParrotController parrotWithDogsController = new ParrotController(new ParrotWithDogs());
		ParrotController parrotWithCatsController = new ParrotController(new ParrotWithCats());
		ParrotController parrotWithRoostersController = new ParrotController(new ParrotWithRoosters());
		parrotWithDogsController.sing("Woof, woof");
		parrotWithCatsController.sing("Meow");
		parrotWithRoostersController.sing("Cock-a-doodle-doo");

	}

	static void checkFish() {
		Fish fish = new Fish();
		fish.swim();

		Shark shark = new Shark();
		shark.swim();
		shark.eat();
		shark.size();
		shark.color();

		ClownFish cownFish = new ClownFish();
		cownFish.swim();
		cownFish.size();
		cownFish.joke();
		cownFish.color();

		Dolhpin dolphin = new Dolhpin();
		dolphin.swim();
	}

	static void checkButterFly() {
		Butterfly butterfly = new Butterfly();
		butterfly.fly();
	}

	public static void main(String[] args) {
		//checkWalkAnimal();
		checkBirds();
		//checkFish();
		//checkButterFly();

		System.out.println("Nnumber of animals can swim :" + swimAnimals());
		System.out.println("Nnumber of animals can fly :" + flyAnimals());
		System.out.println("Nnumber of animals can walk :" + walkAnimals());
		System.out.println("Nnumber of animals can sing :" + singingAnimals());
	}

	public static int swimAnimals() {
		List<CanSwim> swimList = new ArrayList<CanSwim>();
		swimList.add(new Duck());
		swimList.add(new Fish());
		swimList.add(new Shark());
		swimList.add(new ClownFish());
		swimList.add(new Dolhpin());
		return swimList.size();
	}

	public static int walkAnimals() {
		List<CanWalk> walkAnimals = new ArrayList();
		walkAnimals.add(new Caterpillar());
		return walkAnimals.size();
	}
	public static int flyAnimals() {
		List<CanFly> flyAnimals = new ArrayList();
		flyAnimals.add(new Butterfly());
		return flyAnimals.size();
	}
	
	public static int singingAnimals() {
		List<CanSing> singingAnimals = new ArrayList();
		singingAnimals.add(new Duck());
		singingAnimals.add(new Chicken());
		singingAnimals.add(new Rooster());
		singingAnimals.add(new ParrotWithCats());
		singingAnimals.add(new ParrotWithDogs());
		singingAnimals.add(new ParrotWithRoosters());
		return singingAnimals.size();
	}


}
