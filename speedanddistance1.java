/* File: speedanddistance1.java
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

public class speedanddistance1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		speedanddistance1  MPR = new speedanddistance1();
	       MPR.firstspeedanddistance();

	}
	

	@SuppressWarnings("resource")
	public void firstspeedanddistance(){
		
		
		System.out.println("Speed and Distance #1");
		System.out.println("Calculate the average speed in km/h of a rabbit that " +
				"travels ___ km in ___ hours. ");
		// beginning of exception handling
		try{
		
		// scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nTravels : ");
		// get user input
		double input1 = s1.nextDouble();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Hours : ");
		// get user input
		double input2 = s2.nextInt();
		
		
		double ans = input1/input2;

		
		// prints the formula and the steps to solve the word problem.
		
		System.out.println("\nFormula: d = rt \n\n"
				+input1+" = r("+input2+")\n\n"
						+ "First step is to take "+input1+" / "+input2+"\n\n"
								+ans+ " = r \n\n"
						
				+ "The rabbit traveled at a rate of "+ans+" km/h");
		
		
		
		
		}catch(InputMismatchException e){
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
	}

}
