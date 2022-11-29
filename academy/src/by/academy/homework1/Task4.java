package by.academy.homework1;

public class Task4 {

	public static void main(String[] args) {
		int a, b;

		for (a = 2, b = 1;; b++) {
			double c = Math.pow(a, b);
			if (c >= 1_000_000) {
				break;
			}
			System.out.println(a + " в степени " + b + " = " + c);

		}
	}
}
