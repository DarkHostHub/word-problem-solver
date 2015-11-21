/* File: interestproblem1.java
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

public class interestproblem1 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		interestproblem1  MPR = new interestproblem1();
	       MPR.FirstInterest();
		

	}
	
	@SuppressWarnings("resource")
	public void FirstInterest(){
		
		
		System.out.println("Calculating Interest #1");
		System.out.println("How much simple interest accrues on a loan of $_____ at an annual\n" +
				"rate of ___% over a ___ year period?");
		// beginning of exception handling
		try{
		
		// interest problem scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("loan of $: ");
		// get user input for a
		double input1 = s1.nextDouble();
		
		// second input scanner...
		Scanner s2 = new Scanner(System.in);
		System.out.print("rate of %: ");
		// get user input
		double input2 = s2.nextDouble();
		
		// third input scanner...
		Scanner s3 = new Scanner(System.in);
		System.out.print("over a year period: ");
		// get user input for a
		double input3 = s3.nextInt();
	
		// interest = price * rate * time
		double ans = input1*input2*input3;
		double answer = ans / 100;
		
		// prints the formula and the steps to solve the word problem.
		System.out.println("Formula: i = prt\n"
				+ "p = "+input1+"\n"
						+ "r = "+input2+"\n"
								+ "t = "+input3);
		System.out.println("The total accrued interest is $"+answer+" over a " +input3+" year period.");
		
		
		}catch(InputMismatchException e){
			
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		}
	

}
