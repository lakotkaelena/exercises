package by.academy.homework3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 1. Необходимо реализовать программу, которая будет позволять вводить сделки
		 * купли-продажи товаров между двумя участниками. В каждой сделке может быть
		 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
		 * каждого товара рассчитывается из его стоимости и количества. Программа должна
		 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
		 * экран. Ввод информацию осуществляется с экрана (консоли). Количество
		 * дополнительной информацию о сделке, участнике, товаре придумать самому
		 * (больше одного поля для класса). Сделка должна содержать массив продуктов.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);

		ProductMaker p = new DefaultProductMaker(); // поставщик товаров
		Product[] products = p.make(); // формируем список товаров, вызываем метод make
		Product[] basket = new Product[0];
		Person seller = new Person("Продавец", products);
		Person buyer = new Person("Покупатель", basket);
		Deal deal = new Deal(buyer, seller);
		deal.choiceProduct();

		Validator number = new BelorusianPhoneValidator();
		Validator eMail = new EmailValidator();
		DateFormat format = new DateFormat();

		String phone = number.valid();
		String email = eMail.valid();
		String dateOfBirth = format.outDate();
		Person user = new Person(phone, email, dateOfBirth);
		System.out.println("Номер телефона: " + phone + "\n" + "Электронная почта:  " + email + "\n"
				+ "День рождения: " + dateOfBirth);
		

		System.out.println("+10 дней: " + deal.getDeadlineDate());

	}

}
