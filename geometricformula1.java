/* File: geometricformula1.java
 * Title: Algebra Word Problem Solver Class
 * Description: 
 * Author: Blake Neu
 *  Course: CSCI 24000
 * Date: 8/10/2015
 * */

package wordproblempackage;
// exception handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class geometricformula1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Encapsulation and create new instance on the heap.
		   geometricformula1  MPR = new   geometricformula1();
	       MPR.FirstGeometric();

	}
	

	@SuppressWarnings("resource")
	public void FirstGeometric(){
		
		
		System.out.println("Geometric Formula #1");
		System.out.println("Calculate the radius of a circle that has a circumference of ___ inches. \n");
		// beginning of exception handling
		try{
		
		//scanner...
		Scanner s1 = new Scanner(System.in);
		System.out.print("circumference: ");
		// get user input
		double input1 = s1.nextInt();
		
		
		
		// r = 10/2*pie
		double part1 = input1/2;
		
		double part2 = part1/Math.PI;
		double ans = Math.round (part2 * 1000.0) / 1000.0;

		
		// prints the formula and the steps to solve the word problem.
		System.out.println("\nFormula: c = 2*pie*r \n\n"
				+""+input1+ " = 2*pie*r \n\n"
				+ "First step is to get 'r' by itself\n\n"
				+ ""+input1+"/2*pie = r \n\n"
						+ "Next, reduce the fraction if possible\n\n"
						+part1+ "/pie = r \n\n"
								+ "Next, "+part1+" / pie\n\n"
				+ "The radius of the circle is "+ans+ " inches.");
		
		
		
		
		}catch(InputMismatchException e){
			System.out.println("Invalid Input by user: "+e); // catches invalid input i.e. characters other than numbers.
		}catch(ArithmeticException e){
			System.out.println("I think you tried to divide by 0: "+e); // catches no division by 0.
		}
		
		
	}

}
