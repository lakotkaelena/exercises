package by.academy.homework3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateFormat {

	private static final String text = "((0[1-9]|[12][0-9]|3[01])[-\\/.\s](0[1-9]|1[012])[-\\/.\s](19[0-9][0-9]|20[0-2][0-2]))";
	private static final Pattern pattern = Pattern.compile(text);

	public String outDate() {
		Scanner scanner = new Scanner(System.in);
		String date = "";

		for (;;) {
			System.out.println("Введите дату (дд(-/.)мм(-/.)гггг): ");
			date = scanner.nextLine();
			Matcher matcher = pattern.matcher(date);
			if (matcher.matches()) {
				// System.out.println("Дата: " + date);
				break;
			}
		}

		String date1 = date.replaceAll("[-\\\\/.\\s]", "");
		DateTimeFormatter form = DateTimeFormatter.ofPattern("ddMMyyyy");
		LocalDate loc = LocalDate.parse(date1, form);
		int day = loc.getDayOfMonth();
		Month month = loc.getMonth();
		int year = loc.getYear();

		String str = "";
		StringBuilder builder = new StringBuilder(str);

		builder.append("День: ");
		builder.append(day);
		builder.append(", месяц: ");
		builder.append(month);
		builder.append(", год: ");
		builder.append(year);

		return builder.toString();
	}

}
