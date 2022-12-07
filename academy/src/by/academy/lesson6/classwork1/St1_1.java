package by.academy.lesson6.classwork1;

import java.util.Arrays;
import java.util.Scanner;

public class St1_1 {

	public static void main(String[] args) {
		/*
		 * a) Напишите метод, который принимает в качестве параметра любую строку,
		 * например “I like Java!!!”. Распечатать последний символ строки. Используем
		 * метод String.charAt(). Проверить, заканчивается ли ваша строка подстрокой
		 * “!!!”. Используем метод String.endsWith(). Проверить, начинается ли ваша
		 * строка подстрокой “I like”. Используем метод String.startsWith().
		 */

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Введите  строку: ");
//		String data = sc.nextLine();
//		sc.close();

		// public static void lesson() {
//			System.out.println(data.charAt(data.length()-1));
//			if (data.endsWith("!!!")) {
//				String data1="!!!";
//				System.out.println("Строка заканчивается на:  " +data1);
//		}
//			if (data.startsWith("I like")) {
//				String data2="I like";
//				System.out.println("Строка начинается с:  " +data2);
//			}
		/*
		 * Проверить, содержит ли ваша строка подстроку “Java”. Используем метод
		 * String.contains().
		 */
//			if (data.contains("Java")) {
//				String data3="Java";
//				System.out.println("Строка содержит подстроку:  " +data3);
//			}
		/*
		 * Найти позицию подстроки “Java” в строке “I like Java!!!”.
		 */

//			if(data.contains("Java")) {
//				String str="Java";
//				int ch=data.indexOf(str.charAt(0));
//				System.out.println("Подстрока" + str + "начинается с позиции" + ch );
//				
//			}
////			/*
//			 *  Заменить все символы “а” на “о”. 
//			 */
//			
//			String dataN=data.replace('a', 'o');
//			System.out.println("Замена символов: " + dataN);
//			
		/*
		 * з) Преобразуйте строку к верхнему регистру.
		 */
//			String dataNN=data.toLowerCase();
//			System.out.println("нижний регистр: " + dataNN);

		/*
		 * и) Преобразуйте строку к нижнему регистру.
		 * 
		 */

//			String dataNNN=data.toUpperCase();
//			System.out.println("Верхний регистр: " + dataNNN);

		/*
		 * Вырезать строку Java c помощью метода String.substring().
		 */
//			String str="Java";
//			String dataS="Java".substring(str.length());
//			System.out.println(dataS);

		/*
		 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented
		 * programming» (не учитываем регистр символов) на «OOP». Например строка
		 * "Object-oriented programming is a programming language model organized around objects rather than "
		 * actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
		 * должна быть преобразована в
		 * "Object-oriented programming is a programming language model organized around objects rather than "
		 * actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
		 * 
		 */
		String string = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

		String searchString = "object-oriented programming";
		String replaseString = "OOP";
		String stringL = string.toLowerCase(); // переводим в нижний регистр
		StringBuilder str = new StringBuilder(stringL);

		int n = 0; // количекство вхождений подстроки в строку
		int p = 0; // начальный индекс, с которого начинаем поиск
		int[] search = new int[3];
		while (p != -1) { // пока р не вернет индекс -1, ищем
			p = str.indexOf(searchString, p);

			if (p != -1) {
				search[n] = p; // найденные значения индексов записываем в массив
				p++;
				n++;

			}

		}
//System.out.println(Arrays.toString(search));

		 System.out.println(n);

		for (int i = 0; i < search.length-1; i++) {
			if (search[i] < search[i + 1]) {
				int p1 = search[i + 1];
				search[i + 1] = search[i];
				search[i] = p1;
			}
		}
		
		System.out.println(Arrays.toString(search));
		
		for (int i = 0; i < search.length-1; i++) {
			if(i%2==0) {
				str.replace(search[i], search[i]+searchString.length(), replaseString);
			}
		}
		System.out.println(str);
		
	}
	

}
