package com.xworkz.InhritTask;

public class Plant extends LivingThing{
	
	Plant()
	{
		System.out.println("Running no args const in Plant");
	}
	Plant(String name,String color,int price)
	{
		super(name,color,price);
		System.out.println("Running string,String,int in const Plant..");
		this.name=name;
		this.color=color;
		this.price=price;
		
	}
}
