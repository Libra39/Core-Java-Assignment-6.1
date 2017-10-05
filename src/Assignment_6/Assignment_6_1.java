package Assignment_6;																							// Package declared
/**
 * Declare an integer array of size 10. Initialize using for loop with 1 to 10, and print all even numbers from an array.
 *
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
public class Assignment_6_1 {																					// Class Declared
	public static void main(String args[]) {																	// Main Method Started
		int sort, myInteger;																					// two integer variable initialized sort and myInteger 
		int[] myArray = { 33, 2, 4, 71, 88, 92, 9, 1, 2, 34 };													// input array declared		
		for (myInteger = 0; myInteger < myArray.length; myInteger++){											// for loop expression for sorting integers in ascending order
			for (int myNextInteger = myInteger + 1; myNextInteger < myArray.length; myNextInteger++){			// nested for loop expression to determine that the next integer in the array is even or not
				if (myArray[myInteger] > myArray[myNextInteger]){												// if loop to check whether current position integer is greater than the next integer, 
					sort = myArray[myInteger];																	// if yes then store the integer in the sort
					myArray[myInteger] = myArray[myNextInteger];												// and if integer is equal to the next integer then
					myArray[myNextInteger] = sort;}																// store the next integer in the sort
			}																									// if loop closed
		}																										// for loop closed
		System.out.print("Input numbers :");																	// Print statement
		for (myInteger = 0;  myInteger < myArray.length; myInteger++){											// for loop expression to print the input array
			System.out.print(" " + myArray[myInteger]);}														// Print Array 
 
		System.out.print("\nEven numbers  :");																	// Print statement
		for (myInteger = 0; myInteger < myArray.length; myInteger++){											// for loop expression to print the even number array
			if (myArray[myInteger] % 2 == 0){																	// if loop to determine the even numbers 
 				System.out.print(" " + myArray[myInteger]);	}													// Print even number array
		}																										// for loop closed
	}																											// main method closed
}																												// class Assignment_6_1 closed
