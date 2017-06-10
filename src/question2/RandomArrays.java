/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package question2;

import java.util.*; //importing all lists using *

public class RandomArrays {

	public static void main(String[] args) {
		
		//Creating ArrayList named randomnums; Integer Type-wrapper Class
		List<Integer> randomnums = new ArrayList<Integer>();
		
		//Using for loop to populate the ArrayList using Math.random()
		for (int i = 0; i<10; i++){
			
			//AUTOBOXING; Casting to int as Math.random returns double value
			randomnums.add((int)(Math.random()*10)); 
			
		}
		//Using System.out to create a header in the console
		System.out.println("The random numbers in Array List are: ");
		
		//Using enhanced for loop to traverse the array and display contents of ArrayList with System.out.printn(p)
		for (Integer p : randomnums){
			
			System.out.println(p); //AUTO-UNBOXING
		}
		
		
		randomnums.remove(1); //Removing second element from ArrayList
		
		//Using System.out to create a header in the console
		System.out.println("\n\nThe random numbers in Array List with 1 removed are: "); 

		
		//Traversing the list with a ListIterator and displaying contents
		ListIterator<Integer> itr = randomnums.listIterator();
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next()); //AUTO-UNBOXING; Using System.out.print for formatting and easier legibility
		}
	
		//Convert the ArrayList to a LinkedList
		List<Integer> myList = new LinkedList<Integer>();
	
		//Rerunning the code
		////Using for loop to populate the LinkedList using Math.random()
		for (int i = 0; i<10; i++){
				
		//AUTOBOXING; Casting to int as Math.random returns double value
		myList.add((int)(Math.random()*10));
				
		}
		//Using System.out to create a header in the console
		System.out.println("\n\nThe random numbers in Linked List are: ");
			
		//Using enhanced for loop to traverse the array and display contents of LinkedList with System.out.printn(p)
		for (Integer p : myList){
				
			System.out.println(p);//AUTO-UNBOXING
		}
			
		myList.remove(1);//Removing second element from LinkedList
			
		System.out.println("\n\nThe random numbers in Array List with 1 removed are: ");
			
		//Traversing the list with a ListIterator and displaying contents
		ListIterator<Integer> itr1 = myList.listIterator();
			
		while(itr1.hasNext()){
				
			System.out.print(itr1.next()); //AUTO-UNBOXING; Using System.out.print for formatting and easier legibility
		}
	
	}//ending main method

}//ending class
