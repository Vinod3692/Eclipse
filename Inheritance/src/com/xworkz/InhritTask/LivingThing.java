package com.xworkz.InhritTask;

public class LivingThing {
	String name;
	String color;
	int price;
	
	LivingThing(String name,String color,int price)
	{
		this.name=name;
		this.color=color;
		this.price=price;
	}
	LivingThing()
	{
		System.out.println("Running no args const in LivingThing");
	}
}
