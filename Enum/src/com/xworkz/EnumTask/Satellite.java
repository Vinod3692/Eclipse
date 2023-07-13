package com.xworkz.EnumTask;

public class Satellite {
	String name;
	String color="White";
	SatelliteType type;
	int launch_time;
	Satellite(String name)
	{
		this.name=name;
	}
	void satelliteType(SatelliteType type)
	{
		this.type=type;
	}
	void display()
	{
		System.out.println("satellite_name="+this.name);
		System.out.println("satellite_color="+this.color);
		System.out.println("satellite_type="+this.type);
		System.out.println("satellite_timing="+this.launch_time);
		
	}
}
