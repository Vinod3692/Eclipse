package com.xworkz.InhritTask;

public class Animal {
	String name;
	boolean dance;
	double height;

Animal(String name,boolean dance,double height)
{
	this.name=name;
	this.dance=dance;
	this.height=height;
	}
Animal()
{
	System.out.println("Running no args const in Animal");
	}
}
