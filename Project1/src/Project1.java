import java.util.Scanner;
public class Project1{
	static Scanner reader;


	public static void main(String[] args){
		reader = new Scanner(System.in);



		String yourName;

		double yourAge;


  



		// Here I want you ask for the users name
		// and have the program store it as a variable.
		// You could use System print statements to ask a question
		// Ask name command example  AskName();
		




		// Here I want you to ask for the users age
		// and have the program store it as a variable too.
		// ask age command example  AskAge();






		// Now I want you to tell the person a message if
		// they are under 18 and one if they are older than 18
		// use if statements and printouts
		
		











	}



	// Don't Worry about this stuff



	public static String AskName(){

		//Lets the user type in their name.
		//Then Stores it in the Name Variable.
		String Name = reader.next();

		//This returns what is stored in the Name variable
		return Name;

	}








	public static double AskAge(){

		//Lets the user type in their age.
		//Then Stores it in the Age Variable.
		double Age = reader.nextDouble();

		//This returns what is stored in the Age variable
		return Age;

	}

}