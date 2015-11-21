/* File: interestproblem3.java
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

public class interestproblem3 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		interestproblem3  MPR = new interestproblem3();
	       MPR.ThirdInterest();
		

	}
	
	@SuppressWarnings("resource")
	public void ThirdInterest(){
		
		
		System.out.println("Calculating Interest #3");
		System.out.println("If $______ is deposited into a savings account with an annual interest " +
				"rate of ____%, how much interest is earned over a ___ year period if interest is " +
				"compounded continuously?");
		// beginning of exception handling
		try{
		
		// interest problem scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("Deposited $: ");
		// get user input
		int input1 = s1.nextInt();
		
		// second input scanner...
		Scanner s2 = new Scanner(System.in);
		System.out.print("Rate of %: ");
		// get user input
		
		double input2 = s2.nextDouble();
		
		// third input scanner...
		Scanner s3 = new Scanner(System.in);
		System.out.print("year period: ");
		// get user input
		int input3 = s3.nextInt();
		
		// total = $ (e^rt)
		
		double RandT = (input2 * 0.01) * input3;
		
		double e = Math.exp(RandT);
		
		double answer = input1 * e;
		double rounded = Math.round(answer*100)/100.0d;
		
		double InterestEarned = rounded - input1;
		double roundedFinal = Math.round(InterestEarned*100)/100.0d;
		
		// prints the formula and the steps to solve the word problem.
		System.out.println("b = pe^rt \n"
				+ "p = "+input1+"\n"
						+ "r = "+input2+"\n"
								+ "t = "+input3+"\n");
		
		
		System.out.println("Formula: b = pe^rt\n\n"
				+ "b =  "+input1+"e^"+input2*0.01+"*"+input3+"\n");
		
		System.out.println("First step is to multiply r by t\n"
				+"rt = "+ RandT+"\n");
		
		System.out.println("Current work: b = "+input1+"e^"+RandT+"\n");
		
		System.out.println("Second step is to take E or Eulers and square it by "+RandT+""
				+ " then, multiply it by "+input1+"\n"
				+ "b = "+rounded+"\n");
		
		System.out.println("The final step is to subtract "+rounded+" by "+input1+" \n");
		
		System.out.println("A total of $"+roundedFinal+ " in interest is earned after " +input3+ " years.");
		
		
		}catch(InputMismatchException e){
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
		
		
	}
	
}
