package com.example;

public class IfExample {

	public static void main(String[] args) {
		/*
		 * If statement that checks if 2 variables are equal
		 * this
		 * is
		 * a
		 * multiline
		 * comment
		 */
		
		int a = 50; //note that variable declaration and variable setting can happen in the same line
		int b = 50;
		int c = 12;
		
		if (a == b) {
			//this code only runs if a == b
			System.out.println("a equals b");
		}
		
		
		//else example
		
		if (a == c) {
			System.out.println("a equals c"); //this runs if a equals c
		}
		else {
			System.out.println("a does not equal c"); //this runs if the if evaluates to false
		}
		
		
		//else-if example
		
		if ( (a == b) && (b == c) ) {
			System.out.println("Case1"); //this runs if a=c and b=c
		}
		else if ( (a != c) && (a == (c + 38))) {
			System.out.println("Case2"); //runs if (a=c and b=c) is false, but (a!=c and a = c + 38) is true
		}
		else {
			System.out.println("Case3"); //runs if all of the previous cases are false
		}
		
		
		
		
		//switch statement
		switch (a) {
			case 0:
				System.out.println("a is 0");
				break; //breaks are necessary parts of the syntax
			case 12:
				System.out.println("a is 12");
				break;
			case 50:
				System.out.println("a is 50");
				break;
			default:
				System.out.println("a is neither 0, 12, or 50.");
				
		}
		

	}

}
