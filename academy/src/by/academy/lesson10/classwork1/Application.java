package by.academy.lesson10.classwork1;

public class Application {

	public static void main(String[] args) {
		/*
		 * г) Создать массив типа Printable, который будет содержать книги и журналы.
		 * 
		 */

		Printable[] books = new Printable[5];
		books[0] = new Book("Книга1", 2002, 3.43);
		books[1] = new Book("Книга2", 2010, 3.43);
		books[2] = new Book("Книга3", 2002, 3.43);
		books[3] = new Magazine("Журнал1", 2002, 3.43);
		books[4] = new Magazine("Журнал2", 2002, 3.43);
		/*
		 * д) В цикле пройти по массиву и вызвать метод print() для каждого объекта. 
		 * 
		 */

		for (Printable p : books) {
			p.print();
		}
		/*
		 * Вызываем статические методы
		 */

		Book.printBooks(books);
		Magazine.printMagazines(books);

	}

}
