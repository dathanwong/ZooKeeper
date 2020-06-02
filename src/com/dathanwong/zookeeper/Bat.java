package com.dathanwong.zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Bat taking off");
		this.changeEnergy(-50);
		this.displayEnergy();
	}
	
	public void eatHumans() {
		this.changeEnergy(25);
		this.displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Town is being attacked.");
		this.changeEnergy(-100);
		this.displayEnergy();
	}
}
