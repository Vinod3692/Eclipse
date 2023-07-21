package com.xworkz.superchaining;

public class BoilerChicken extends Chicken{
	boolean alive;
	double weight;

	BoilerChicken(int price, String location, boolean alive, double weight) {
		super(price, location);
		this.alive = alive;
		this.weight = weight;

	}
@Override
	void printInfo() {
		super.printInfo();
		System.out.println("printing info about boiler chicken");
		System.out.println("is broiler chicken alive? " + alive);
		System.out.println("weight of broiler chicken is :" + weight);
	}
}
