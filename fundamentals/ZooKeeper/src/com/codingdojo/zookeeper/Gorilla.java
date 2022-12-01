package com.codingdojo.zookeeper;

public class Gorilla extends ZooKeeper{
	public Gorilla() {
		super();
	}
	public void throwThings() {
		this.setEnergy(this.getEnergy()-5);
		System.out.println("Gorilla threw something!");
	}
	public void eatBanana() {
		this.setEnergy(getEnergy()+10);
		System.out.println("Gorilla ate a banana, and feels refreshed.");
	}
	public void climb() {
		this.setEnergy(getEnergy()-10);
		System.out.println("Gorilla did some climbing!");
	}
	
}
