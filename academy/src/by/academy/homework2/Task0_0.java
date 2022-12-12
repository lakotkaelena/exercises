package by.academy.homework2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task0_0 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		/*
		 * Дан массив с int переменными, определить количество пар, разность которых
		 * эквивалентна заданному с консоли target значению. Например, дан массив чисел
		 * [1,2,3,4] и введенное с консоли target значение 1, у нас есть три пары,
		 * которые подходят под заданное условие: 2-1=1, 3-2=1, 4-3=1. Нужно дописать
		 * код в pairs функции, которая принимает массив int значений и target int
		 * переменную, которая бы возвращала количество пар с заданной разностью.
		 * 
		 */

		System.out.println("Введите значения n и k через пробел: ");
		String[] nk = sc.nextLine().split(" ");
		 System.out.println(Arrays.toString(nk));
		// System.out.println("Введите число k: ");
		
		int n = Integer.parseInt(nk[0]);
		//System.out.println(n);
		int k = Integer.parseInt(nk[1]);
		//System.out.println(k);
		int[] arr = new int [n];
		
		System.out.println("Введите  n чисел: ");
		String[] arrItems = sc.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		Solution s = new Solution();
		int result = Solution.pairs(k, arr);

		System.out.println(result);

		sc.close();

	}

}
