package by.home;

import java.util.Scanner;

public class Number10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Размер а первого дома: ");
		int a = sc.nextInt();
		System.out.println("Размер b первого дома: ");
		int b = sc.nextInt();
		System.out.println("Размер с второго дома: ");
		int с = sc.nextInt();
		System.out.println("Размер d второго дома: ");
		int d = sc.nextInt();
		System.out.println("Длина e участка: ");
		int e = sc.nextInt();
		System.out.println("Ширина f участка: ");
		int f = sc.nextInt();
		sc.close();
		Numb10 num = new Numb10();
		num.numb1();
	}
}

