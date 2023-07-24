package com.xworkz.Override;

public class Example {
	                                  
	static void print()                     
	                                
	{
		System.out.println("task");
	}
	
	int print(int a)
	{
		return a;
	}
	void print(String name)
	{
		System.out.println(name);
	}
	
public static void main(String[] args) {
	Example example=new Example();
	example.print("Vinod");
	int b = example.print(45);
	System.out.println(b);
	}
}
