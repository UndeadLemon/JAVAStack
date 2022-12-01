package com.codingdojo.zookeeper;

public class TestZoo {

	public static void main(String[] args) {
		ZooKeeper mammal = new ZooKeeper(50);
		Gorilla gorilla = new Gorilla();
		GiantBat giantBat = new GiantBat();
		
		System.out.println("-----Basic Testing-----");
		mammal.displayEnergy();
		System.out.println("-----Gorilla Testing-----");
		gorilla.displayEnergy();
		gorilla.throwThings();
		gorilla.throwThings();
		gorilla.throwThings();
		gorilla.eatBanana();
		gorilla.eatBanana();
		gorilla.climb();
		gorilla.displayEnergy();
		System.out.println("-----Giant Bat Testing-----");
		giantBat.displayEnergy();
		giantBat.attackTowns();
		giantBat.attackTowns();
		giantBat.attackTowns();
		giantBat.eatHuman();
		giantBat.eatHuman();
		giantBat.fly();
		giantBat.fly();
		giantBat.displayEnergy();
		
	}

}
