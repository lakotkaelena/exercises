package by.academy.homework2;

import java.util.Arrays;
import java.util.Random;

public class Deal {
	 int n = 5;
	private String[] cardValue = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
	private String[] cardSuit = { "Пики", "Крести", "Бубны", "Червей" };

	public String[] createDeck() {

		String[] deck = new String[cardValue.length * cardSuit.length];

		for (int i = 0; i < cardValue.length; i++) { 
			for (int j = 0; j < cardSuit.length; j++) {

				deck[cardValue.length * j + i] = cardValue[i] + " " + cardSuit[j];

			}
		}

		return deck;

	}

	Random random = new Random();

	public String[] mixDeck(String[] d) {
		int num = 0;
		while (num < d.length - 1) {
			int i = random.nextInt(d.length);
			String buff = d[num];
			d[num] = d[i];
			d[i] = buff;
			num++;
		}

		return d;
	}

	public String[][] handOutCard(String[] d, int numberOfPlayers) {
		String[][] byHand = new String[numberOfPlayers][n];

		for (int i = 0, j = 0, a = 0; i < numberOfPlayers * n; i++, j++) {
			if (j == numberOfPlayers) {
				j = 0;
				a++;
			}
			byHand[j][a] = d[i];
			
		}

		return byHand;

	}
}
