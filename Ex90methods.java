package bookExercises;

import javax.swing.JOptionPane;

public class Ex90methods {

	public void performCalculation(int a, int b, int c) {

		if (c == 0) {

			JOptionPane.showMessageDialog(null, "END OF APPLICATION");

			return;
		}

		else if (c == 1) {

			quadDiff();

		}

		else if (c == 2) {

			quadSoma(a, b);

		}

		else if (c == 3) {

			int result;

			result = somaQuad();

			JOptionPane.showMessageDialog(null, "Sum of the squares of two numbers : " + result);

		}

		else if (c == 4) {

			int result;

			result = diffQuad(a, b);

			JOptionPane.showMessageDialog(null, "Difference of the squares of two numbers: " + result);
		}

		else if (c == 5) {

			prod();
		}

		else {

			JOptionPane.showMessageDialog(null, "No option was selected");
		}

	}

	public void quadDiff() {

		int a, b, result;

		a = (int) (Math.random() * 100);

		b = (int) (Math.random() * 100);

		result = (a - b) * (a - b);

		JOptionPane.showMessageDialog(null, "Square of the difference: " + result);

	}

	public void quadSoma(int a, int b) {

		int result = (a + b) * (a + b);

		JOptionPane.showMessageDialog(null, "Square of the sum: " + result);
	}

	public int somaQuad() {

		int a, b, result;

		a = (int) (Math.random() * 100);

		b = (int) (Math.random() * 100);

		result = a * a + b * b;

		return result;

	}

	public int diffQuad(int a, int b) {

		int result;

		result = a * a - b * b;

		return result;
	}

	public void prod() {

		int a, b, result;

		a = (int) (Math.random() * 100);

		b = (int) (Math.random() * 100);

		result = (a - b) * (a + b);

		JOptionPane.showMessageDialog(null, "Product of the sum and the difference of two numbers: " + result);

	}
}