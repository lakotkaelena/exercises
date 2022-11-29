package by.academy.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String type = sc.nextLine();
		System.out.println("Введите число: ");
		String a = sc.nextLine();
		sc.close();

		switch (type) {
		case "int":
			System.out.println(Integer.parseInt(a) % 2);
			break;
		case "double":
			System.out.println(Double.parseDouble(a) * 0.70);
			break;
		case "float":
			float f = Float.parseFloat(a);
			System.out.println(f * f);
			break;
		case "char":
			System.out.println(a.charAt(0));
			break;
		case "String":
			System.out.println("Hello " + a);
			break;
		default:
			System.out.println("Тип данных не поддерживается");
		}

	}
}
