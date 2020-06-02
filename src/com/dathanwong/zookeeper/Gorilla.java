package com.dathanwong.zookeeper;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		
	}
	
	public void throwThings() {
		this.changeEnergy(-5);
		System.out.println("Gorilla threw something. Energy: " + this.getEnergyLevel());
	}
	
	public void eatBananas() {
		this.changeEnergy(10);
		System.out.println("Gorilla ate a banana. Energy: " + this.getEnergyLevel());
	}
	
	public void climb() {
		this.changeEnergy(-10);
		System.out.println("Gorilla climbed a tree. Energy: " + this.getEnergyLevel());
	}
}
