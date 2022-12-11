package by.academy.homework2;

public class Task1 {
	
	boolean check(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		if (str1.equals(str2)) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			String char1 = String.valueOf(str1.charAt(i));
			if (!str2.contains(char1)) {
				return false;
			}
		}
		return true;
	}
	
}
