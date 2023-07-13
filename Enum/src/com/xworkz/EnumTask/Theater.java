package com.xworkz.EnumTask;

public class Theater {
		String theaterName;
		int ticketCost=600;
		TheaterType  theaterType;
		String movieName;
		Theater(String theaterName)
		{
			this.theaterName=theaterName;
			
		}
		void typeOfTheatre(TheaterType  theaterType)
		{
			this.theaterType=theaterType;
		}
		void display()
		{
			System.out.println("Theatre Name="+this.theaterName);
			System.out.println("cost of ticket="+this.ticketCost);
			System.out.println("Theatre type="+this.theaterType);
			System.out.println("Movie Name="+this.movieName);
		}
}
