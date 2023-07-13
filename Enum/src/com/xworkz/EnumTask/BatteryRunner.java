package com.xworkz.EnumTask;

public class BatteryRunner 
{
	public static void main(String[] args) {
		
		Battery battery=new Battery("EXIDE");
		battery.batteryType(BatteryType.RECHARGEABLE);
		battery.price=50000;
		battery.display();
		
		Battery battery1=new Battery("LUMINUOS");
		battery1.batteryType(BatteryType.LITHIUM);
		battery1.price=45000;
		battery1.display();
   }
}
