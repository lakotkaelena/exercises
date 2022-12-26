package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BelorusianPhoneValidator implements Validator {

	private static final Pattern pattern = Pattern.compile("((\\+375)|(80))[-\s]?((29)|(25)|(33)|(44))[-\s](\\d{7})");

	Scanner scanner = new Scanner(System.in);

	@Override
	public String valid() {
		System.out.println("Введите номер телефона: ");
		String value;
		for (;;) {

			value = scanner.nextLine();
			if (pattern.matcher(value).matches()) {

				break;
			} else {
				System.out.println("Повторите ввод");
			}
		}
		return value;
	}

}
