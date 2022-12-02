package by.academy.lesson4.classwork1;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * 0. Создать массив типа String с размером 7. Записать в него значения дней
		 * недели. Вывести на консоль значение последнего элемента.
		 */

		// String [] array1= {"понедельник",
		// "вторник","среда","четверг","пятница","суббота","воскресенье"};
		// int i=array1.length;
		// System.out.println(array1[i-1]);

		/*
		 * 1. Создать массив типа double с размером 4. Записать в него любые значения с
		 * помощью блока для инициализации. Вывести на консоль значение первого
		 * элемента.
		 */

		// double[] array2 = new double[4];
		// Random rand = new Random(); // как с классом Scanner;
		// for (int i = 0; i < array2.length; i++) { // заполняем массив случайными
		// числами
		// array2[i] = rand.nextDouble(10) * 10;
		// System.out.println(array2[i]);
		// }
		// System.out.println();
		// System.out.println("Значение первого элемента массива: " + array2[0]);

		/*
		 * 2. Создать массив типа String размером 3х6. И записать в него значения: a1 a2
		 * a3 a4 a5 a6 b1 b2 b3 b4 b5 b6 c1 c2 c3 c4 c5 c6 И распечатать.
		 */
		// char c = 'a';
		// String[][] array3 = new String[3][6];
		// for (int i = 0; i < array3.length; i++) {
		// for (int j = 0; j < array3[i].length; j++) {
		// array3[i][j] = " " + c + (i + 1);
		// }
		// c++;

		// }
		// System.out.println(Arrays.deepToString(array3));

		/*
		 * 3. Создать двумерный массив типа char размером 4х2. И записать туда значения
		 * с помощью блока для инициализации. Распечатать значения массива.
		 */

		// char[][] array4 = new char[4][2];
		// char c = '%';
		// for (int i = 0; i < array4.length; i++) {
		// for (int j = 0; j < array4[i].length; j++) {

		// array4[i][j] = c++;
		// }

		// }

		// System.out.println(Arrays.deepToString(array4));

		/*
		 * 4. Создать двухмерный массив 5х8 и инициализировать его с помощью блока для
		 * инициализации. Найти максимальное и минимальное значение в каждой "строке" и
		 * записать эти значения в двухмерный массив 5х2. Распечатать оба массива.
		 */

		// int[][] array5 = new int[5][8];
		// int i, j;
		// Random rand = new Random(10); //заполняем массив случайными числами
		// for (i = 0; i < array5.length; i++) {
		// for (j = 0; j < array5[i].length; j++) {
//
		// array5[i][j] = rand.nextInt(100);
		// }

		// }System.out.println(Arrays.deepToString(array5));
		// int [][] array6=new int [5][2];
		// int a,b;
		// for (i = 0; i < array5.length; i++) {
		// int max = array5[i][0];
		// for (j = 1; j < array5[0].length; j++) { //ищем максимальное значение
		// if (max < array5[i][j])
		// max = array5[i][j];
		// array6[i][0]=max;
		// }

		// }
		// for (i = 0; i < array5.length; i++) {
		// int min = array5[i][0];
		// for (j = 1; j < array5[0].length; j++) { //ищем минимальное значение
		// if (min > array5[i][j])
		// min = array5[i][j];
		// array6[1][0]=min;
		// }

		// } System.out.println(Arrays.deepToString(array6));
		/*
		 * поменять местами первый и последний элементы
		 */
		// int []array= {4,2,5,7,3,7,1,8,10}; // создали массив

		// for (int i=0;i<array.length;i++) {
		// for (int j=i+1: j<array.length;j++) {

		// int temp=array[i]; // запоминаем первый элемент
		// array[i]=array[j]; //присваиваем значение последнего элемента
		// array [j]=temp;
		// }

		// [] ar1= {'f','y','a','c','b','f','m','s','r'};
		// int a=0, b=0;

//	for ( a=0;a<ar1.length;a++) {
		// for (b=0;b<ar1.length;b++) {
		// if (ar1[a]>ar1[b]) {
		// char t=ar1[a];
		// ar1[a]=ar1[b];
		// ar1 [b]=t;

		// }System.out.println((ar1));
		// }
		// }
		// String s="Для работы со строками в языке Java используются классы String,"
		// + " StringBuilder, StringBuffer";
		// int index=-3;
		// do {
		// index=s.indexOf('S', index+1);
		// if (index>=0) {
		// System.out.println(index);
		// System.out.println('S');
		// }

		// }

		// System.out.println("IndexOf(S)="+s.indexOf('S'));
		// System.out.println("IndexOf(S,60)="+s.indexOf('S',60));
		// System.out.println("IndexOf(S,65)="+s.indexOf('S',65));
		// System.out.println("IndexOf(S,80)="+s.indexOf('S',80));

		// }
		// }
		/*
		 * Ввести n строк с консоли, найти самую короткую и самую длинную строки.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку: ");
		String s1 = sc.nextLine();
		System.out.println("Введите количество строк: ");
		int n = sc.nextInt();
		sc.close();

		int i = 0;
		for (i = 1; i < s1.length(); i++) {
			if (i >= 0) {
				i++;
				
			}
		}

	}
}
