/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

import java.util.Scanner; //selecting and bringing in the scanner utility

public class TemperatureConverterTester {
	//class name based on end goal
	
	public static void main(String[] args) {
		
		int choice = 0; //declaring and initialising choice variable
		int temp; //declaring temp variable
		
		//creating new TemperatureConverter Object
		TemperatureConverter tempObject = new TemperatureConverter(); 
		
		//Declaring and creating instance of the scanner class
		Scanner input = new Scanner(System.in);
		
		//Creating while loop
		while (choice != 3) {
			
			//Output to console to inform user of how to operate program
			System.out.println("1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n3. Exit");
			
			//Prompting user to enter data
			System.out.print("Enter your Choice: ");
			choice = input.nextInt(); //assigning user input to the Choice variable
			
			//Creating if statement for user input = 1 (ie Fahrenheit to Celsius)
			if (choice == 1) {
				System.out.print("Enter your Temperature: "); //Output to console to prompt user
				temp = input.nextInt(); //Assigning user input to temp variable
				tempObject.celsius(temp); //passing temp variable into the celsius method
			}
			//Creating else if statement for user input = 2 (ie Celsius to Fahrenheit)
			else if (choice == 2) {
				System.out.print("Enter your Temperature: ");
				temp = input.nextInt(); //Assigning user input to temp variable
				tempObject.fahrenheit(temp); //passing temp variable into the fahrenheit method
			}
			//Creating else if statement for user input = 2 (ie To Terminate the Program)
			else if (choice == 3) {
				System.out.println("Program Terminated"); //Output to console
			}
		}
		
		input.close(); //close input to avoid possible leak
	
	}//ending main method

}//ending class
