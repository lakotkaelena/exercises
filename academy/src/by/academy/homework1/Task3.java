package by.academy.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = sc.nextInt();
		sc.close();

		for (int b = 1; b <= 10; b++) {
			int res = a * b;
			if (b > 10) {
				break;
			}
			System.out.println(a + "*" + b + "=" + res);
		}

	}

}
