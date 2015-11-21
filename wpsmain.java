/* File: wpsmain.java
 * Title: Algebra Word Problem Solver
 * Description: 
 * Author: Blake Neu
 *  Course: CSCI 24000
 * Date: 8/10/2015
 * */

package wpspackage;

import java.util.Scanner;
// import custom package
import wordproblempackage.*;

public class wpsmain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new wpsmain();
	}
	
	public wpsmain(){
		boolean run = true;
		// keep program running so the user does not have to restart the program to go to the next problem.
		while(run){
		String command;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// main menu of the program
		System.out.print("***********************************************************\n"
				+ "\nALGEBRA WORD PROBLEM SOLVER\n\n"
				+ "-----------------------------\n" +
				"Menu \n" +
				"-----------------------------\n" +
				"(1) Interest Problems\n" +
				"(2) Geometric Formula\n" +
				"(3) Speed and Distance\n" +
				"(4) Mixture and Combination\n" +
				"(5) Exit the program.\n" +
				"-----------------------------\n" +
				"Command: ");
		command = in.next();
		
		
		// command conditions...
		if(command.equals("1")){
			// sub-menu of the program
			String command2;
			@SuppressWarnings("resource")
			Scanner in2 = new Scanner(System.in);
			System.out.print("-----------------------------\n" +
					"Sub-Menu \n" +
					"-----------------------------\n" +
					"(a) Simple Interest\n" +
					"(b) Compounded Monthly\n" +
					"(c) Compounded Continuously\n" +
					"-----------------------------\n" +
					"Sub-Menu Command: ");
			command2 = in2.next();
			// end of sub-menu
			// options for sub menu
			if(command2.equals("a")){
				// first word problem
				interestproblem1 C = new interestproblem1();
				 C.FirstInterest();
				 continue;
			}else if(command2.equals("b")){
				// second word problem
				interestproblem2 C = new interestproblem2();
				 C.SecondInterest();
				 continue;
			}else if(command2.equals("c")){
				// third word problem
				interestproblem3 C = new interestproblem3();
				 C.ThirdInterest();
				 continue;
			}else{}

		}else if(command.equals("2")){
			// sub-menu
			String command3;
			@SuppressWarnings("resource")
			Scanner in3 = new Scanner(System.in);
			System.out.print("-----------------------------\n" +
					"Sub-Menu \n" +
					"-----------------------------\n" +
					"(a) Radius of a circle\n" +
					"(b) Area of a square\n" +
					"-----------------------------\n" +
					"Sub-Menu Command: ");
			command3 = in3.next();
			// end of sub-menu
			// condition for options
			if(command3.equals("a")){
				// first word problem
				geometricformula1 C = new geometricformula1();
				 C.FirstGeometric();
				 continue;
			}else if(command3.equals("b")){
				// second word problem
				geometricformula2 C = new geometricformula2();
				 C.SecondGeometric();
				 continue;
			}else{}
			
		}else if(command.equals("3")){
			// sub-menu
			String command4;
			@SuppressWarnings("resource")
			Scanner in4 = new Scanner(System.in);
			System.out.print("-----------------------------\n" +
					"Sub-Menu \n" +
					"-----------------------------\n" +
					"(a) Average speed traveling at rate of\n" +
					"(b) Distance traveled in minutes\n" +
					"-----------------------------\n" +
					"Sub-Menu Command: ");
			command4 = in4.next();
			// end of sub-menu
			// condition for options
			if(command4.equals("a")){
				// first problem
				speedanddistance1 C = new speedanddistance1();
				 C.firstspeedanddistance();
				 continue;
			}else if(command4.equals("b")){
				// second problem
				speedanddistance2 C = new speedanddistance2();
				 C.secondspeedanddistance();
				 continue;
			}else{}
			
		}else if(command.equals("4")){
			// sub-menu
			String command4;
			@SuppressWarnings("resource")
			Scanner in4 = new Scanner(System.in);
			System.out.print("-----------------------------\n" +
					"Sub-Menu \n" +
					"-----------------------------\n" +
					"(a) Nickels and Pennies Total\n" +
					"-----------------------------\n" +
					"Sub-Menu Command: ");
			command4 = in4.next();
			// end of sub-menu
			// condition for options
			if(command4.equals("a")){
				// first problem
				mixtureandcombo1 C = new mixtureandcombo1();
				 C.firstmixtureandcombo();
				 continue;
			}else{}
			
		}else if(command.equals("5")){
			System.out.println("You have exited the program.");
			// stops the while loop and exits the program.
			break;
		}
		
	}// end of while
		
		} // end of wpsmain
		
}

