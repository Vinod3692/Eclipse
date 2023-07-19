package com.xworkz.Override;

public class HighCourt extends SupremeCourt{
	public void criminalCase() {
		System.out.println("Deals with the criminal case");
	}
	public void forgeryCase() {
		System.out.println("Deals with the forgery case");
	}
	@Override
	public void importantCase() {
		System.out.println("Deals with the important case");
	}
}
