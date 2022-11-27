package by.home;

import java.util.Scanner;

public class Number9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("День: ");
		int a = sc.nextInt();
		System.out.println("Месяц: ");
		int b = sc.nextInt();
		System.out.println("Год: ");
		int с = sc.nextInt();
		sc.close();

		if (a >= 1 && a <= 31 && b == 1) {
			System.out.println((++a) + " января " + с + " года");

		}
		if (a >= 1 && a <= 28 && b == 2) {
			System.out.println(a + " февраля " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 3) {
			System.out.println(a + " марта " + с + " года");
		}
		if (a >= 1 && a <= 30 && b == 4) {
			System.out.println(a + " апреля " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 5) {
			System.out.println(a + " мая " + с + " года");
		}
		if (a >= 1 && a <= 30 && b == 6) {
			System.out.println(a + " июня " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 7) {
			System.out.println(a + " июля " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 8) {
			System.out.println(a + " августа " + с + " года");
		}
		if (a >= 1 && a <= 30 && b == 9) {
			System.out.println(a + " сентября " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 10) {
			System.out.println(a + " октября " + с + " года");

		}
		if (a >= 1 && a <= 30 && b == 11) {
			System.out.println(a + " ноября " + с + " года");
		}
		if (a >= 1 && a <= 31 && b == 12) {
			System.out.println(a + " декабря" + с + " года");
		}
	}
}

