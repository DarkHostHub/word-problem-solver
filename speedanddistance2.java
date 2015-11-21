/* File: speedanddistance2.java
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

public class speedanddistance2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		speedanddistance2  MPR = new speedanddistance2();
	       MPR.secondspeedanddistance();

	}
	

	@SuppressWarnings({ "resource" })
	public void secondspeedanddistance(){
		
		
		System.out.println("Speed and Distance #2");
		System.out.println("How far will a runner moving at an average speed of __ mph " +
				"travel in ___ minutes?");
		// beginning of exception handling
		try{
		
		// scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("Mph : ");
		// get user input
		double input1 = s1.nextDouble();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Minutes : ");
		// get user input
		double input2 = s2.nextInt();
		
		// distance = rate*time
		
		double part1 = input2/60;

		double part2 = input1 * part1;
		
		// prints the formula and the steps to solve the word problem.
		
		System.out.println("\nFormula: d = rt \n\n"
				+ "The rate is in mph, so we use "+input1+" / 1 \n\n"
				+ "Next, "+input2+" / 60, for the minutes  = "+part1+"\n\n"
				+ "next, multiply "+input1+" and "+part1+" \n\n"
				+ "The runner has ran "+part2+" miles total.");
		
		
		
		}catch(InputMismatchException e){
			
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
		
	}
}
