//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		
		System.out.println("Week 1 Lab");

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int availablePlaneSeats = 5; 
		System.out.println(availablePlaneSeats);
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGroceries = 43.63;
		System.out.println(costOfGroceries);
		// 3. Create a variable to hold a person's middle initial

	   char middleInital = 'B';
	   System.out.println(middleInital);
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside

		boolean isColdOutside = true;
		System.out.println(isColdOutside);
		// 5. Create a variable to hold a customer's first name

		String customerFirstName = "Tom";
		System.out.println(customerFirstName);
		// 6. Create a variable to hold a street address
		
		String streetAdress = ("123 John Street");
		System.out.println(streetAdress);
		// 7. Print all variables to the console
	System.out.println("allVariables");
	System.out.println("Available seats left on the plane: " + availablePlaneSeats);
	System.out.println("43.63 " + costOfGroceries + " is the price for groceries");
	System.out.println("The person's middle initial is " + middleInital);
	System.out.println("It is hot outside - " + "isHotOutside");	
	System.out.println("The customers first name is " + customerFirstName);
	System.out.println("streetAddress" + " is where the person lives.");
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	System.out.println("a customer booked 2 plane seats");
	availablePlaneSeats -= 2;
	System.out.println("Updated available plane seats left on the plane: " + availablePlaneSeats);
	
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
	System.out.println("candy bar purchase");
	costOfGroceries += 2.15;
	System.out.println("2.15" + costOfGroceries + "is the new price for groceries");

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		System.out.println("birth certificate");
		middleInital = 'B';
		System.out.println("The person's middle inital is " + middleInital);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		System.out.println("season has changed");
		String ("isHotOutside");
		System.out.println("It is hot outside - " + isColdOutside);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		System.out.println("full name");
		String fullname = customerFirstName + " " + middleInital + " David";
		System.out.println("The full name is " + fullname);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Introduces the customer");
		System.out.println("Hi, my name is" + fullname + "and i live at" + streetAdress + ".");
		
		
	}

	private static void String(String string) {
		// TODO Auto-generated method stub
		
	}
}