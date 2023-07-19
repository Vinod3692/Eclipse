package com.xworkz.Override;

public class FamilyCourt extends CivilCourt{
	public void divorceCase() {
		System.out.println("Deals with the divirce case");
	}
	@Override
	public void propertyCase() {
		System.out.println("Deals with the property case");
	}
	public void theftCase() {
		System.out.println("Deals with the theft case");
	}
}
