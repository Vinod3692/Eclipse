package com.xworkz.EnumTask;

public class Battery {
	String brand;
	String color="RED";
	BatteryType type;
	int price;
	Battery(String brand)
	{
		this.brand=brand;
	}
	void batteryType(BatteryType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println("B_brand="+this.brand);
		System.out.println("B_color="+this.color);
		System.out.println("B_type="+this.type);
		System.out.println("B_price="+this.price);
		
	}
}
