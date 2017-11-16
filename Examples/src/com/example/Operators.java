package com.example;

public class Operators {

	public static void main(String[] args) {
		
		//MATHEMATICAL OPERATORS
		
		double example1 = 7.0006;
		double example2 = 12.2;
		
		//addition, subtraction, multiplication, and division operators
		System.out.println(example1 + example2);
		System.out.println(example2 - example1);
		System.out.println(example1 * example2);
		System.out.println(example1 / example2);
		
		//The sky is everything but Blue
		//BOOLEAN OPERATORS
		
		//EQUALS
		System.out.println(example1 + example2 == 19);
		
		//DOES NOT EQUAL
		System.out.println(example2 - example1 != 5);
		
		//NOT
		System.out.println( !(example1 == example2) );
		
		//OR
		System.out.println( (3 + 4 == 7) || (example1 == example2) );
		
		//AND
		System.out.println( ("Hello" == "World") && (example1 != example2) );
		
		
	}

}
