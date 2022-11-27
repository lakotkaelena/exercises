package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String type = sc.nextLine();
		System.out.println("Введите число: ");
		double a = sc.nextInt();
		sc.close();

		switch (type) {
		case "int":
			System.out.println( a % 2);
			break;
		case "double":
			System.out.println(a * 0.70);
			break;
		case "float":
			System.out.println( a * a);
			break;
		case "char":
			System.out.println((char) 0);  // ????
			break;
		case "String":
			System.out.println("Hello " + a);
			break;
		default:
			System.out.println("Тип данных не поддерживается");
		}

	}
}

