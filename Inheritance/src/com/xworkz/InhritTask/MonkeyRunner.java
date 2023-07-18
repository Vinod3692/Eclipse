package com.xworkz.InhritTask;

public class MonkeyRunner {
	public static void main(String[] args) {
		Animal animal3=new Animal();
		
		Animal animal=new Monkey("Mike",true,2.5);
		System.out.println(animal.name);
		System.out.println(animal.dance);
		System.out.println(animal.height);
		
		Animal animal2=new Animal("Rubi",false,2.1);
		System.out.println(animal2.name);
		System.out.println(animal2.dance);
		System.out.println(animal2.height);
		
		}
}
