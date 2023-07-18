package com.xworkz.InhritTask;

public class Money extends Strength {
	
	Money()
	{
		System.out.println("Running no args const in Money");
	}
	Money(String property,int income,boolean happiness)
	{
		super(property,income,happiness);
		System.out.println("Running string,int,boolean in const Money..");
		this.property=property;
		this.income=income;
		this.happiness=happiness;
		
	}
}
