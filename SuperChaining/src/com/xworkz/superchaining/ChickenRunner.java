package com.xworkz.superchaining;

public class ChickenRunner {
	public static void main(String[] args) {
		Chicken chicken = new Chicken(240, "Bidar");
		chicken.printInfo();
		System.out.println();

		Chicken boiler = new BoilerChicken(350, "Noor Dhaba", false, 1.5);
		boiler.printInfo();
		System.out.println();

		Chicken farm = new FarmChicken(800, "7 star",6, "Rafi miya");
		farm.printInfo();

	}

}
