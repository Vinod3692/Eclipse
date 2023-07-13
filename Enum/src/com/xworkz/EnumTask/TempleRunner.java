package com.xworkz.EnumTask;

public class TempleRunner {
	public static void main(String[] args) 
	{	
		Temple temple=new Temple(TempleName.BALAJI);
		temple.Name="Venkateswara swamy";
		temple.ticketprice=0;
		temple.display();
		
		Temple temple1=new Temple(TempleName.HANUMAN);
		temple1.Name="Hunuman";
		temple1.ticketprice=30;
		temple1.location="Ayodha";
		temple1.display();
		
	}

}
