package by.academy.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Сумма покупки: ");
		double sum = sc.nextDouble();
		System.out.println("Возраст покупателя: ");
		int age = sc.nextInt();
		sc.close();

		int sale = 0;

		if (sum < 100) {
			sale = 5;
		} else if (sum < 200) {
			sale = 7;
		} else if (sum < 300) {
			sale = 12;
			if (age > 18) {
				sale += 4;
			} else {
				sale -= 3;
			}
		} else if (sum < 400) {
			sale = 15;
		} else {
			sale = 20;
		}

		double finalSum = sum - (sum * sale / 100);

		System.out.println("Финальная цена со скидкой " + sale + "% составит: " + finalSum + " рублей");

	}
}
