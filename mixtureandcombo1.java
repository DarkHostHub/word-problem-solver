/* File: mixtureandcombo1.java
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

public class mixtureandcombo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		mixtureandcombo1  MPR = new mixtureandcombo1();
	       MPR.firstmixtureandcombo();

	}
	

	@SuppressWarnings({ "resource" })
	public void firstmixtureandcombo(){
		
		
		System.out.println("Mixture and Combination #1");
		System.out.println("A collection of___ nickels and pennies is worth ___ cents. How many of the coins are nickels?");
		// beginning of exception handling
		try{
		
		// scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nNickels and Pennies : ");
		// get user input
		int input1 = s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Cents : ");
		// get user input
		int input2 = s2.nextInt();
		
		// 
		
		double part1 =  0.01*(input2 - input1);
		
		double ans = part1 / 0.04;
		
		// prints the formula and the steps to solve the word problem.

		System.out.println("\nFormula: n(0.05)+("+input1*0.01+" - n)(0.01) = "+input2*0.01+"\n");
		
		System.out.println("Move both 'n' values over \n"
				+ "0.05n + "+input1*0.01+" - 0.01n = "+input2*0.01+"\n\n");
		
		System.out.println("Subtract both 'n' values \n"
				+ "0.05n - 0.01n + "+input1*0.01+" = "+input2*0.01+"\n\n");
		
		System.out.println("Next, move"+input1+" on the other side \n"
				+ "0.04n + "+input1*0.01+" = "+input2*0.01+"\n\n");
		
		System.out.println("Next, subtract the total\n"
				+ "0.04n = "+input2*0.01+" - "+input1*0.01+"\n\n");
		
		System.out.println("The final step is "+part1+" / 0.04\n"
				+ "0.04n = "+part1+"\n\n");

		System.out.println(ans+"\n\n");
		
		System.out.println("There are "+ans+" nickels in "+input1+ " coins.");
		
		
		
		}catch(InputMismatchException e){
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
		
	}
}
