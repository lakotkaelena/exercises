package by.academy.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Deal {

	private LocalDate deadlineDate;
	private Person bayer; // покупатель
	private Person seller; // продавец

	public Deal(Person bayer, Person seller) {
		this.bayer = bayer;
		this.seller = seller;
	}

	public Person getBayer() {
		return bayer;
	}

	public Person getSeller() {
		return seller;
	}

	public LocalDate getDeadlineDate() {
		LocalDate deadlineDate = LocalDate.now();
		return deadlineDate.plusDays(10);
	}

	public void choiceProduct() {
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Хотите выбрать товар?" + "\n 1. Да" + "\n 2. Нет");

			int ch = scanner.nextInt();
			if (ch == 2) {
				printBasket(bayer.getProducts());
				break;
			}
			System.out.println("Выберите товар из списка: ");
			System.out.println(" Наименование:" + "\t" + "Количество:");
			for (int i = 0; i < seller.getProducts().length; i++) {

				System.out.println(i + 1 + ")" + seller.getProducts()[i].getName() + "  \t  "
						+ seller.getProducts()[i].getQuantity());
			}
			int productPosition = scanner.nextInt();
			Product selected = seller.getProducts()[productPosition - 1];

			if (selected.getQuantity() == 0) {
				System.out.println("Данный товар закончился");
				continue;
			}

			System.out.println("Введите количество товара: ");
			ch = scanner.nextInt();

			while (ch > selected.getQuantity()) {
				System.out.println("Вы ввели количество больше " + selected.getQuantity() + ". Повторите ввод: ");
				ch = scanner.nextInt();
			}

			boolean isAddProductBasket = true;
			for (int i = 0; i < bayer.getProducts().length; i++) {

				if (bayer.getProducts()[i].getName().equals(selected.getName())) {
					if (ch <= selected.getQuantity()) {
						selected.setQuantity(selected.getQuantity() - ch);
						bayer.getProducts()[i].setSelectedCount(bayer.getProducts()[i].getSelectedCount() + ch);
						isAddProductBasket = false;
						break;
					} else {
						isAddProductBasket = false;
						System.out.println("В наличии " + (selected.getQuantity() + " единиц товара"));
					}
				}

			}
			if (isAddProductBasket) {
				bayer.setProducts(Arrays.copyOf(bayer.getProducts(), bayer.getProducts().length + 1));

				selected.setQuantity(selected.getQuantity() - ch);
				selected.setSelectedCount(ch);
				bayer.getProducts()[bayer.getProducts().length - 1] = seller.getProducts()[productPosition - 1];

			}

		} while (true);

	}

	private void printBasket(Product[] basket) {
		double result = 0;

		System.out.println("Дата  " + LocalDate.now());
		System.out.println("Наименование \t Категория \t Количество \t Стоимость, рублей");
		System.out.println("----------------------------------------------------------------------");
		for (int i = 0; i < basket.length; i++) {

			System.out.println(i + 1 + ")" + basket[i].getName() + " \t " + basket[i].getType() + " \t          "
					+ basket[i].getSelectedCount() + " \t          "
					+ String.format("%.2f", basket[i].getPriceSelectedProduct()));
			result += basket[i].getPriceSelectedProduct();
		}
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Итог " + String.format("%.2f", result) + " руб.");
	}
}
