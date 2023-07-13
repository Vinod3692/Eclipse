package com.xworkz.EnumTask;

public class Temple {
	String Name;
	int ticketprice;
	String location="Tirupati";
	TempleName nameOfTemple;
	Temple(TempleName nameOfTemple)
	{
		
		this.nameOfTemple=nameOfTemple;
	}
	void price(int ticketprice)
	{
		this.ticketprice=ticketprice;
	}
	void display()
	{
		System.out.println("God Name="+this.Name);
		System.out.println("Ticket Price="+this.ticketprice);
		System.out.println("location of Temple="+this.location);
		System.out.println("Temple name="+this.nameOfTemple);
	}
}
