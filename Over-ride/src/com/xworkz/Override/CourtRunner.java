package com.xworkz.Override;

public class CourtRunner {

	public static void main(String[] args) {
		Court court=new Court();
		court.justice();
		
		
		//SupremeCourt
		
		Court court1=new SupremeCourt();
		court1.justice();
		
		SupremeCourt supreme=new SupremeCourt();
		supreme.importantCase();
		
		
		//HighCourt
		
		Court court2=new HighCourt();
		court2.justice();
		
		SupremeCourt supreme1=new HighCourt();
		supreme1.importantCase();
		supreme1.justice();
		
		HighCourt high=new HighCourt();
		high.criminalCase();
		high.forgeryCase();
		high.justice();
		high.importantCase();
		
		
		//CivilCourt
		
		Court court3=new CivilCourt();
		court3.justice();
		
		SupremeCourt supreme2=new CivilCourt();
		supreme2.importantCase();
		supreme2.justice();
		
		HighCourt high1=new CivilCourt();
		high1.criminalCase();
		high1.forgeryCase();
		high1.justice();
		high1.importantCase();
		
		CivilCourt civil=new CivilCourt();
		civil.propertyCase();
		civil.theftCase();
		civil.criminalCase();
		civil.forgeryCase();
		civil.justice();
		
		//FamilyCourt
		
		Court court4=new FamilyCourt();
		court4.justice();
		
		SupremeCourt supreme3=new FamilyCourt();
		supreme3.importantCase();
		supreme3.justice();
		
		HighCourt high2=new FamilyCourt();
		high2.criminalCase();
		high2.forgeryCase();
		high2.justice();
		high2.importantCase();
		
		CivilCourt civil1=new FamilyCourt();
		civil1.propertyCase();
		civil1.theftCase();
		civil1.criminalCase();
		civil1.forgeryCase();
		civil1.justice();
		civil1.importantCase();
		
		FamilyCourt family=new FamilyCourt();
		family.divorceCase();
		family.propertyCase();
		family.theftCase();
		family.criminalCase();
		family.forgeryCase();
		family.justice();
		family.importantCase();
		
		
	}

}

