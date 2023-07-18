package com.xworkz.InhritTask;

public class MoneyRunner {
	public static void main(String[] args) {
		
	Strength strength=new Strength();
	
	Strength strength1=new Money("Home",2,false);
	System.out.println(strength1.property);
	System.out.println(strength1.income);
	System.out.println(strength1.happiness);
	
	Strength strength2=new Strength("land",5,true);
	System.out.println(strength2.property);
	System.out.println(strength2.income);
	System.out.println(strength2.happiness);
	
	}
}
