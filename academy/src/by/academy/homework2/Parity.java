package by.academy.homework2;

public class Parity {

	String par(String str1, String str2) {
		String not = "Некорректные данные";
		if (str1.length() % 2 != 0) {
			return not;
		}
		if (str2.length() % 2 != 0) {
			return not;

		}

		int size1 = str1.length() / 2;
		int size2 = str2.length() / 2;

		String sb = str1.substring(0, size1);
		String sb1 = str2.substring(size2, str2.length());

		return sb.concat(sb1);
	}
}
