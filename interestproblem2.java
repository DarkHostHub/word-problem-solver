/* File: interestproblem2.java
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

public class interestproblem2 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		interestproblem2  MPR = new interestproblem2();
	       MPR.SecondInterest();
		

	}
	
	@SuppressWarnings("resource")
	public void SecondInterest(){
		
		
		System.out.println("Calculating Interest #2");
		System.out.println("If $_____ is depositied into a savings account with a ___% annual\n" +
				"interest rate compounded monthly, what is the balance of the account ___ years later?");
		// beginning of exception handling
		try{
		
		// interest problem scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("Deposited $: ");
		// get user input
		double input1 = s1.nextInt();
		
		// second input scanner...
		Scanner s2 = new Scanner(System.in);
		System.out.print("annual %: ");
		// get user input
		
		double input2 = s2.nextDouble();
		
		// third input scanner...
		Scanner s3 = new Scanner(System.in);
		System.out.print("year later: ");
		// get user input
		double input3 = s3.nextInt();
		
		// interest = $(1 + r/n)^nt
		
		// r Over n...
		double RoverN = 1 + input2/12 * 0.01;
		
		double NoverTSqr = 12 * input3;
		
		double answer = Math.pow(RoverN, NoverTSqr);
		
		double answerM = answer * input1;
		
		double rounded = Math.round(answerM*100)/100.0d;
		
		// prints the formula and the steps to solve the word problem.
		System.out.println("Formula: b = p(1+r/n)^nt \n"
				+ "p = "+input1+"\n"
						+ "r = "+input2+"\n"
								+ "n = "+input3+"\n"
										+ "t = 12 \n");
		
		System.out.println("The first step is to solve (1 + r/n) formula \n");
		System.out.println("(1 + r/n) = "+RoverN+"\n");
		System.out.println("b = "+input1+"("+RoverN+")^"+NoverTSqr+"\n");
		
		System.out.println("The second step is to  square (1 + r/n) by " +NoverTSqr+"\n");
		System.out.println("b = "+input1+"("+answer+")\n");
		
		System.out.println("The final step is to multiply "+input1+" by "+answer+" and you should get: \n");
		
		System.out.println("The balance of the account is $"+rounded);
		
		
		
		
		
		}catch(InputMismatchException e){
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
	}
	
}
