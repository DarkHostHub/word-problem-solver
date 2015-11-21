/* File: geometricformula2.java
 * Title: Algebra Word Problem Solver Class
 * Description: 
 * Author: Blake Neu
 *  Course: CSCI 24000
 * Date: 8/10/2015
 * */

package wordproblempackage;
//exception handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class geometricformula2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		   geometricformula2  MPR = new geometricformula2();
	       MPR.SecondGeometric();

	}
	

	@SuppressWarnings("resource")
	public void SecondGeometric(){
		
		
		System.out.println("Geometric Formula #2");
		System.out.println("Calculate the area of a square that has a perimeter of ___ cm. \n");
		// beginning of exception handling
		try{
		
		// scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("Perimeter: ");
		// get user input
		double input1 = s1.nextInt();
		
		
		
		// r = 10/2*pie
		double part1 = input1/2;
		
		double part2 = Math.pow(part1, 2);
		
		double ans = part2 / 4;

		
		// prints the formula and the steps to solve the word problem.
		System.out.println("\nFormula: p = 4s \n\n"
				+input1+ " = 4s \n\n"
				+ "Each side of the square is "+part1 / 2+" inches long \n\n"
						+ "Next formula: A = (s)^2 \n\n"
						+ "Next, take "+part1 / 2+" and square it to get the area of the square. \n\n"
				+ "The area of the square is "+ans+" inches squared.");
		
		
		
		}catch(InputMismatchException e){
			
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
		
	}

}
