package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Сумма покупки: ");
		double a = sc.nextInt();
		System.out.println("Возраст покупателя: ");
		int b = sc.nextInt();
		sc.close();

		if (a >= 200 && a < 300) {
			if (b > 18) {
				System.out.println("Ваша скидка 16%. Сумма покупки с учетом скидки: " + (a - (a * 0.16)) + " рублей");
			} else {
				System.out.println("Ваша скидка 9%. Сумма покупки с учетом скидки: " + (a - (a * 0.09)) + " рублей");
			}
		}
		if (a < 100) {
			System.out.println("Финальная цена со скидкой 5% составит: " + (a - (a * 0.05)) + " рублей");
		} else if (a >= 100 && a < 200) {
			System.out.println("Финальная цена со скидкой 7% составит: " + (a - (a * 0.07)) + " рублей");

		} else if (a >= 300 && a < 400) {
			System.out.println("Финальная цена со скидкой 15% составит: " + (a - (a * 0.15)) + " рублей");
		} else if (a >= 400) {
			System.out.println("Финальная цена со скидкой 20% составит: " + (a - (a * 0.20)) + " рублей");
		}

	}
}

