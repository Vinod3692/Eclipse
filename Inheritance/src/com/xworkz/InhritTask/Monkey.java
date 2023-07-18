package com.xworkz.InhritTask;

public class Monkey extends Animal {
	
	Monkey()
	{
		System.out.println("Running no args const in Monkey");
	}
	Monkey(String name,boolean dance,double height)
	{
		super(name,dance,height);
		System.out.println("Running string,boolean,double in const Monkey..");
		this.name=name;
		this.dance=dance;
		this.height=height;
		
	}
}
