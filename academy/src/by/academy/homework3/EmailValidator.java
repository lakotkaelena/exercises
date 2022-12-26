package by.academy.homework3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private static final Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

	Scanner scanner = new Scanner(System.in);

	@Override
	public String valid() {
		System.out.println("Введите email: ");
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
