package com.xowrkz.Casting;

public class NikeShoe extends Shoe {
	String ceo;
	String brandAmbassador;
	NikeShoe(String ceo,String brandAmbassador,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
		this.price=price;
		this.size=size;
		this.color=color;
	}
	void printInfo()
	{
		System.out.println("Invoking method in Nikeshoe");
		System.out.println("Nike shoe ceo="+this.ceo);
		System.out.println("Nike shoe brandAmbassador="+this.brandAmbassador);
		System.out.println("Nike price="+this.price);
		System.out.println("Nike size="+this.size);
		System.out.println("Nike color="+this.color);
	}
}
