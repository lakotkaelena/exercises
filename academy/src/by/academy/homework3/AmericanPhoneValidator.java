package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private static final Pattern pattern = Pattern.compile("\\+1(\\d{3})[0-9]{7}");

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
