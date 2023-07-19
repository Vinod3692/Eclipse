package com.xworkz.Override;

public class CivilCourt extends HighCourt{
	public void propertyCase() {
		System.out.println("Deals with the property case");
	}
	public void theftCase() {
		System.out.println("Deals with the theft case");
	}
	@Override
	public void criminalCase() {
		System.out.println("Deals with the criminal case");
	}
	public void forgeryCase() {
		System.out.println("Deals with the forgery case");
	}
}
