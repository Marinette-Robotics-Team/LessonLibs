package com.example;
import java.util.Scanner;
public class CalculatorProj {
static Scanner reader;
	
	//y'all are gonna make a calculator app
	public static void main(String[] args) {
		reader = new Scanner(System.in);
		
		
		/*
		 * The app will take 3 inputs:
		 * the 2 numbers to act on, and the operator to act on them
		 * 
		 * it must support:
		 * +
		 * -
		 * *
		 * /
		 * % - (remainder operator e.g: 5 % 2 == 1)
		 * ^ - exponents (you'll have to look this up)
		 * 
		 * The result should be printed to the screen.
		 * 
		 */
		
		//To get user number input for the math problem
		// use the method AskNumber();
		// AskNumber(); returns a double
		
		
		//To get user operator input
		// use the method AskOperator();
		// AskOperator(); returns a String
		
		
		double Number1;  
		double Number2;
		String Operator;
		
		


	}
	
	
	//Dont worry about the fancy magic that goes on down here
	//its me just abstracting stuff to make it easy
	
	
	public static double AskNumber(){

		//Lets the user type a number.
		//Then Stores it in the Number Variable.
		double Number = reader.nextDouble();

		//This returns what is stored in the Number variable
		return Number;

	}
	
	public static String AskOperator(){

		//Lets the user type in an Operator.
		//Then Stores it in the Operator Variable.
		String Operator = reader.next();

		//This returns what is stored in the Operator variable
		return Operator;

	}

}
