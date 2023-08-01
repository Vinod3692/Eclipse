package com.xworkz.string;

public class Robot {

	public static void main(String[] args) {

		String example = "xworkz is an institute";

		System.out.println(example.charAt(10)); 

		System.out.println(example.concat("started in june")); 

		System.out.println(example.substring(7)); 
		
		System.out.println(example.substring(7, 12)); 

		System.out.println(example.indexOf("institute")); 
		System.out.println(example.indexOf("institute", 12)); 

		String example2 = "xworkz is an @institute";
		String exstr[] = example.split("started");
		for (String exs2 : exstr) {
			System.out.print(exs2); 
		}
		System.out.println();

		System.out.println(example.equalsIgnoreCase(example2)); 

		System.out.println(example.equals(example2)); 

		String example3 = "todays class was of Strings";

		System.out.println(example.compareTo(example2)); 

		System.out.println(example.compareToIgnoreCase(example3)); 

		String name = "royal challangers bengalore";
		char n[] = name.toCharArray();
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}

		System.out.println(name.toUpperCase()); 

		System.out.println(name.isEmpty()); 

		System.out.println(name.length()); 

		System.out.println(name.startsWith("S"));
		
		System.out.println(name.replace('o', 'a'));

		System.out.println(example2.replaceAll("@", "-")); 

	}

}
