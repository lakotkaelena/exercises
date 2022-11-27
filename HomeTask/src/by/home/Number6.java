package by.home;

import java.util.Scanner;

public class Number6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер прямоугольного отверстия а: ");
		int a = sc.nextInt();
		System.out.println("Введите размер прямоугольного отверстия b: ");
		int b = sc.nextInt();
		System.out.println("Введите радиус круглой картонки r: ");
		int r = sc.nextInt();
		sc.close();

		int c = (((a^2) + (b^2)) / 4)^(1/2);
		if (r>=c) {
			System.out.println("Прямоугольное отверстие полностью закрыто");
		} else {
			System.out.println("Прямоугольное отверстие полностью не закрыто");

		}
	}

}

