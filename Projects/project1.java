import java.util.Scanner;
Public class Project1{
	Scanner reader;


	Public static Void main(){
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






		// Now I want you to greet the user by their name
		// and say how old they are.












	}



	// Don't Worry about this stuff



	Public static String AskName(){

		//Lets the user type in their name.
		//Then Stores it in the Name Variable.
		String Name = reader.next();

		//This returns what is stored in the Name variable
		return Name;

	}








	Public static double AskAge(){

		//Lets the user type in their age.
		//Then Stores it in the Age Variable.
		double Age = reader.nextdouble();

		//This returns what is stored in the Age variable
		return Age;

	}

}