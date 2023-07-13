package com.xworkz.EnumTask;

public class ResortRunner {
	public static void main(String[] args) {

		Resort resort=new Resort("Vintage village resort");
		resort.food("Masala-Puri");
		resort.roomType=TypeOfResort.NON_AC;
		resort.display();
		Resort resort1=new Resort("Pyramid resort");
		resort1.food("Hari-Dosa");
		resort1.roomType=TypeOfResort.AC;
		resort1.display();
	}
}
