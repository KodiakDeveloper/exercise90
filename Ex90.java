package bookExercises;

import javax.swing.JOptionPane;

public class Ex90 {

	public static void main(String[] args) {

		String userAnswer;

		Ex90methods ex = new Ex90methods();

		int userInput1, userInput2;

		int inputCode;

		do {

			userInput1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input first value: "));

			userInput2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input second value: "));

			inputCode = Integer.parseInt(JOptionPane.showInputDialog(null,
					"What do you want to calculate?" + "\n1 - Square of the difference" + "\n2 - Square of the sum"
							+ "\n3 - Sum of the squares of two numbers"
							+ "\n4 - Difference of the squares of two numbers"
							+ "\n5 - Product of the sum and the difference of two numbers" + "\n0 - Exit the program"));

			ex.performCalculation(userInput1, userInput2, inputCode);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

	}

}
