package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_0 {

	public static void main(String[] args) {
		/*
		 * Напишите программу Deal.java, которая должна имитировать раздачу карт для
		 * игры в покер. Программа получает число n, задаваемое с консоли пользователем,
		 * и раздает карты на n игроков (по 5 карт каждому) из рассортированной колоды.
		 * Разделяйте пять карт, выданных каждому игроку, пустой строкой.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество игроков: ");
		int numberOfPlayers = scanner.nextInt();
		if (numberOfPlayers == 0) {
			System.out.println("Ошибка. Нулевое число игроков");
		}
		if (numberOfPlayers > 10) {
			System.out.println("Слишком большое число игроков");
		}

		Deal deal = new Deal();

		String[] deck = deal.createDeck();
		// System.out.println(Arrays.toString(deck));

		String[] deck1 = deal.mixDeck(deck);
		// System.out.println(Arrays.toString(deck1));

		String[][] deck3 = deal.handOutCard(deck1, numberOfPlayers);

		System.out.println(Arrays.deepToString(deck3));
	}

}
