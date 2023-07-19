package com.xworkz.Override;

public class SupremeCourt extends Court{
	public void importantCase() {
			System.out.println("Deals with the important case");
	}
	@Override
	public void justice() {
		System.out.println("Gives the justice for the victim");
	}
}
