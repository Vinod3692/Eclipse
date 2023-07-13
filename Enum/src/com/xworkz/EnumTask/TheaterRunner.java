package com.xworkz.EnumTask;

public class TheaterRunner {
	public static void main(String[] args) {
		
		Theater theater=new Theater("PVR theater");
		theater.movieName="JUMANJI";
		theater.theaterType=TheaterType.ARENA;
		theater.display();
		Theater theater1=new Theater("SAI theater");
		theater1.movieName="ANABELLA";
		theater1.theaterType=TheaterType.HORROR;
		theater1.ticketCost=400;
		theater1.display();
}
}
