package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Ounces {
	public static void main(String[] args) {
		String chair ="What was your most recent test grade? Don't include the percent sign.";
		String grades = JOptionPane.showInputDialog(null,chair);
		double grade = Double.parseDouble(grades);
		if (grade == 100 || grade > 100) {
			String four = "As expected";
			JOptionPane.showMessageDialog(null,four);
		}
		else if(grade >= 90) {
			double leftover = 100-grade;
			String fault = "WHERE DID THE OTHER "+leftover+" GO? INTO YOUR COLLEGE SAVINGS? I DON'T THINK YOU'RE GOING TO NEED IT!";
			JOptionPane.showMessageDialog(null,fault);
		}
		else {
			String four = "I will send you to Jesus!! -My dad quoting Steven He";
			JOptionPane.showMessageDialog(null,four);
		}
		
	}
}
