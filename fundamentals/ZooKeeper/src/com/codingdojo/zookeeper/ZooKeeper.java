package com.codingdojo.zookeeper;

public class ZooKeeper {
	private int energy;
	public ZooKeeper() {
		this.energy=100;
	}
	public ZooKeeper(int energyValue) {
		this.energy = energyValue;
	}
	public int displayEnergy() {
		System.out.println("This animal's energy is: " + this.getEnergy());
		return this.getEnergy();
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
}
