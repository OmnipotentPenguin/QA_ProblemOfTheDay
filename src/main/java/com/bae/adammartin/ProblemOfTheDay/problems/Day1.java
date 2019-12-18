package com.bae.adammartin.ProblemOfTheDay.problems;

/*
Write an algorithm that meets the following specification:
Input "we are the best bae cohort ever"
Processing make the following output: "We Are The Best BAE Cohort Ever"
 */

public class Day1 {
	
	public static void caplitalize(String input) {
		String[] splitString = input.split(" ");
		
		for (int i = 0; i < splitString.length; i++) {
			
			if (splitString[i].equals("bae")) {
				splitString[i] = "BAE";
			}			
			System.out.println(splitString[i].substring(0,1).toUpperCase() + splitString[i].substring(1));
		}	
	}
}
