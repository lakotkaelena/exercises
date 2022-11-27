package by.academy.homework1;

public class Cat {
	int age;                  
	String nickname;
    double money;
    String initials;
    boolean isHomeAnimal=true;
    
	public Cat() {

	}

	public Cat(String nickname) {
		this.nickname = nickname;

	}
	public double getMoney(double money) {
		return money;
	}
	public void setMoney(double money) {
		 this.money=money;
	}
	public String getInitials(String inintials) {
		return initials;
	}
	public void setInitials(String inintials) {
		this.initials=initials;
	}
	public boolean getIsHomeAnimal(boolean isHomeAnimal) {
		return isHomeAnimal;
	}
	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal=true;
	}
	public void grow() {
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
