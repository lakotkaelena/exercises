package by.home;

import java.util.Scanner;

public class Number8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Задайте целое число: ");
		int a = sc.nextInt();
		sc.close();
		int b = a % 10;

		if (a % 10 == 0) {
			System.out.println(a + " рублей");

		} else if (a % 10 == 1) {
			System.out.println(a + " рубль");

		} else if (a % 10 == 2) {
			System.out.println(a + " рубля");

		} else if (a % 10 == 3) {
			System.out.println(a + " рубля");

		} else if (a % 10 == 4) {
			System.out.println(a + " рубля");

		} else if (a % 10 == 5) {
			System.out.println(a + " рублей");

		} else if (a % 10 == 6) {
			System.out.println(a + " рублей");

		} else if (a % 10 == 7) {
			System.out.println(a + " рублей");

		} else if (a % 10 == 8) {
			System.out.println(a + " рублей");
		} else if (a % 10 == 9) {
			System.out.println(a + " рублей");

		}

	}
}

