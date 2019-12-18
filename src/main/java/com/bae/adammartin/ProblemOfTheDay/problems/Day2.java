package com.bae.adammartin.ProblemOfTheDay.problems;

/*
 Write a program that prints the numbers from 1 to 100.
For multiples of three print “Fosbury” instead of the number
For the multiples of five print “Flop”.
For numbers which are multiples of both three and five print “FosburyFlop”.
 */

public class Day2 {
	
	public static void print100() {
		
		for (int i=1; i<101; i++) {
			
			if (i%3 == 0) {
				if (i%5 == 0) {
					System.out.println("FosburyFlop");
				} else {
				System.out.println("Fosbury");
				}
			} else if (i%5 == 0) {
				System.out.println("Flop");
			} else {
				System.out.println(i);
			}			
		}		
	}
}
