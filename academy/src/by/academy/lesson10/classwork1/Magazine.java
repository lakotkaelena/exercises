package by.academy.lesson10.classwork1;

/*
 * в) Определить класс Magazine, реализующий интерфейс Printable.

 */

public class Magazine implements Printable {
	private String name;
	private int year;
	private double price;

	public Magazine() {

	}

	public Magazine(String name, int year, double price) {
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
		System.out.println("Magazine " + name);

	}
	/*
	 * е) Создать статический метод printMagazines(Printable[] printable) в
	 * классе Magazine, который выводит на консоль названия только журналов. 
	 */

	public static void printMagazines(Printable[] books) {
		for (Printable p : books) {
			if (p instanceof Magazine) {
				p.print();

			}
		}
	}

}
