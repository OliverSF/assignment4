/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question1;

public class TemperatureConverter {
	//class name based on end goal
	
	
	//creating celsius method to convert fahrenheit to celsius
	public void celsius (int i) {
		
		/*creating new variable 'newtemp' of type int (for whole numbers as per example!)
		 * Assigning it to the calculation of fahrenheit to celsius with i to be int variable passed into method
		 */
		int newtemp = ((int)((5.0/9.0)*(i - 32))); 
		
		//Output to console
		System.out.println(i + " Fahrenheit is " + newtemp + " Celsius\n"); 
	}
	
	//creating fahrenheit method to convert celsius to fahrenheit
	public void fahrenheit (int i) {
		
		//Assigning newtemp to calculation of celsius to fahrenheit
		int newtemp = ((int)((9.0/5.0)*i + 32));
		
		//Output to console
		System.out.println(i + " Celsius is " + newtemp + " Farenheit\n");
	}
	
}//ending class
