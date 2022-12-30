package by.academy.lesson10.classwork1;
/*
 * б) Определить класс Book, реализующий интерфейс Printable.

 */

public class Book implements Printable {

	private String name;
	private int year;
	private double price;

	public Book() {

	}

	public Book(String name, int year, double price) {
		this.name = name;
		this.year = year;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void print() {
		System.out.println("Book " + name);

	}
	/*
	 * Создать статический метод printBooks(Printable[] printable) в классе Book,
	 * который выводит на консоль названия только книг. Используем
	 * оператор instanceof.
	 * 
	 */

	public static void printBooks(Printable[] books) {
		for (Printable p : books) {
			if (p instanceof Book) {
				p.print();

			}
		}
	}

}
