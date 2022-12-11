package by.academy.homework2;

import java.util.Scanner;

public class Task3_0 {

	public static void main(String[] args) {
		/*
		 * Условие здачи: ввести 2 слова, состоящие из четного числа букв. Получить
		 * слово состоящее из первой половины первого слова и второй половины второго
		 * слова.
		 */

		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слова: ");

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		sc.close();
		
		Parity p=new Parity();
		
		  System.out.println(p.par(str1, str2));

			
		}
		

	}


