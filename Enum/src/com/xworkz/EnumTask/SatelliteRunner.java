package com.xworkz.EnumTask;

public class SatelliteRunner {
	
    public static void main(String[] args) {
		
		Satellite satellite=new Satellite("CHANDRAYAN");
		satellite.satelliteType(SatelliteType.CHANDRAYAN_3);
		satellite.launch_time=2;
		satellite.display();
		
		Satellite satellite1=new Satellite("ISRO");
		satellite1.satelliteType(SatelliteType.GSLV);
		satellite1.launch_time=4;
		satellite1.color="yellow";
		satellite1.display();
   }
}
