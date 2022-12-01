package com.codingdojo.zookeeper;

public class GiantBat extends ZooKeeper {
	public GiantBat() {
		super(300);
	}
	public void attackTowns() {
		this.setEnergy(this.getEnergy()-100);
		System.out.println("*crackling flames*");
	}
	public void eatHuman() {
		this.setEnergy(getEnergy()+25);
		System.out.println("Giant Bat ate a human, and feels very refreshed.");
	}
	public void fly() {
		this.setEnergy(getEnergy()-50);
		System.out.println("Woosh!");
	}
}
