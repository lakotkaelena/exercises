package by.academy.homework1;

public class Application {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Том");
		Cat cat2 = new Cat();

		cat1.eat();
		cat1.sleep();
		cat1.walk();
		
		cat2.grow();
		cat2.grow();
		cat2.grow();
		System.out.println(cat2.age);
		
		cat1.getInitials("T");
		System.out.println("Первая буква клички кота: " +cat1.initials);

		cat1.getIsHomeAnimal(true);
		System.out.println("Является ли домашним животным: " +cat1.isHomeAnimal);

		
		double getMoney=cat1.getMoney(67.89);  //????
		System.out.println(getMoney);
		

	}

}
