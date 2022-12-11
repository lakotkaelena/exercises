package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Ввести две строки с консоли. Определить, является ли одна строка
		 * перестановкой символов другой строки. Учитываем регистр. Не использовать
		 * сортировку :) Например: ⦁ “hello” и “hlleo” -> true ⦁ “hello” и “art” ->
		 * false
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 2 строки: ");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		Task1 task1 = new Task1();
		
		//System.out.println(task1.check(str1,str2));
		
		
		boolean b=task1.check(str1, str2);
		
		System.out.println(String.format("“%s” и “%s” -> %s", str1,str2,b));
		
		
		
		
		

	}
}
