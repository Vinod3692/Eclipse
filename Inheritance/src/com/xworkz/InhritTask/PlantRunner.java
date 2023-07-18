package com.xworkz.InhritTask;

public class PlantRunner {
	public static void main(String[] args) {
		
		LivingThing livingthing=new LivingThing();
		
		LivingThing livingthing1=new Plant("Jasmine","Purple",200);
		System.out.println(livingthing1.name);
		System.out.println(livingthing1.color);
		System.out.println(livingthing1.price);
		System.out.println("");
		
		LivingThing livingthing2=new LivingThing("Rose","Red",600);
		System.out.println(livingthing2.name);
		System.out.println(livingthing2.color);
		System.out.println(livingthing2.price);
		
		}

}
