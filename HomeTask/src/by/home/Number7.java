package by.home;

import java.util.Scanner;

public class Number7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		int a = sc.nextInt();
		sc.close();
		
		if (a%10==7) {
			System.out.println("Последняя цифра числа - семь");

		} else {
			System.out.println("Последняя цифра числа не является семеркой");

		}
	}

}
