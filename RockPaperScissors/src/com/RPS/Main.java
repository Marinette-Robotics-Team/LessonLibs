package com.RPS;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		/*
		 * your task is to implement rock, paper scissors
		 * the program must ask the user which one they want to play
		 * and expect the value "rock", "paper", or "scissors"
		 * 
		 * It must then randomly pick a value for the AI, and print:
		 * what the palyer played
		 * what the AI played
		 * who won
		 * 
		 * You have access to the getString() command, which returns a string of user input,
		 * and the getRandomRange(a, b) command, which returns a value on the range specified.
		 * 
		 * 
		 * Good Luck.
		 */

		
		
	}
	
	//dont worry about this stuff
	private static String getString() {
		return sc.next();
	}
	
	private static int getRandomRange(int start, int end) {
		Random rand = new Random();
		return rand.nextInt(end - start + 1) + start;
	}
	

}
