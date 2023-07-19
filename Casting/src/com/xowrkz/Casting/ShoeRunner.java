package com.xowrkz.Casting;

public class ShoeRunner {
	public static void main(String[] args)
	{
		PumaShoe puma=new PumaShoe("Party wear","Germany",1839,ShoeSize.SEVEN,ShoeColor.BLACK);
		puma.printInfo();
		NikeShoe nike=new NikeShoe("Jhon Joseph Donahoe","Cristianio Ronaldo",7495,ShoeSize.NINE,ShoeColor.WHITE);
		nike.printInfo();
	}
}
