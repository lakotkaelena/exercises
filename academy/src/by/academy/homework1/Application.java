package by.academy.homework1;


public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();

		cat1.eat();
		cat1.sleep();
		cat1.walk();

		cat2.grow(3);
		System.out.println(cat2.age);

		cat1.getInitials(cat1.nickname);
		System.out.println("Первая буква клички кота: " + cat1.nickname.charAt(0));

		cat1.getIsHomeAnimal(cat1.isHomeAnimal);
		System.out.println("Является ли домашним животным: " + cat1.isHomeAnimal);

		cat1.getMoney(cat1.money );
		System.out.println(cat1.money);

	}

}

