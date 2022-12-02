package by.academy.homework1;

public class Cat {
	int age = 2;
	String nickname = "Tom";
	double money = 675;
	boolean isHomeAnimal = true;

	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;

	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getMoney(double money) {
		return money;
	}

	public void setInitials(String nickname) {
		this.nickname = nickname;
	}

	public String getInitials(String nickname) {
		return nickname;
	}

	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}

	public boolean getIsHomeAnimal(boolean isHomeAnimal) {
		return isHomeAnimal;
	}

	public void grow(int i) {
		age++;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

}
