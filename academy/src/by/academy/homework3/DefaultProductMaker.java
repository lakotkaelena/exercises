package by.academy.homework3;

import java.util.Random;
import java.util.Scanner;

public class DefaultProductMaker implements ProductMaker {

	public Product[] make() {
		

		Product[] products = new Product[10];
		products[0] = new Vegetable("Картофель", 3.05, 10);
		products[1] = new Vegetable("Морковь", 1.05, 10);
		products[2] = new Vegetable("Капуста", 4.30, 10);
		products[3] = new Fruits("Яблоко", 1.95, 10);
		products[4] = new Fruits("Груша", 1.99, 10);
		products[5] = new Fruits("Виноград", 7.45, 10);
		products[6] = new Wine("Кагор", 12.03, 10);
		products[7] = new Wine("Саперави", 14.00, 10);
		products[8] = new Wine("Ркацители", 16.55, 10);
		products[9] = new Wine("Шардоне", 20.13, 10);

		return products;
	}

}
