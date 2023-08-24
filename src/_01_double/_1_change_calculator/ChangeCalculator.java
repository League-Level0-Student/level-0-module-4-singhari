package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String re = "How many nickels do you have?";
		String name = JOptionPane.showInputDialog(null,re);
		int nickelsbase = Integer.parseInt(name);
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		String red = "How many dimes do you have?";
		String dname = JOptionPane.showInputDialog(null,red);
		int dimesbase = Integer.parseInt(dname);
		// Ask the user how many dimes they have, and convert their answer
		String ni = "How many quarters do you have?";
		String er = JOptionPane.showInputDialog(null,ni);
		int quartersbase = Integer.parseInt(er);
		// Ask the user how many quarters they have, and convert their answer
double dimes = 0.1*dimesbase;
double quarters = 0.25*quartersbase;
double nickels = 0.05*nickelsbase;
double sum = dimes+quarters+nickels;
		// Calculate how much money the user has.  Hint: Use a double variable 
String op = "Your sum is $"+sum;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, op);
	}
}

