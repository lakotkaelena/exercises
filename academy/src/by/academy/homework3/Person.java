package by.academy.homework3;

import java.time.LocalDate;

public class Person {
	private String phone;
	private String email;
	private String dateOfBirth;
	private String name;
	private Product[] products;

	public Person(String name, Product[] products) {
		this.products = products;
		this.name = name;
	}

	public Person(String phone, String email, String dateOfBirth) {
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;

	}

	public String getName() {
		return name;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public void DateOfBirth() {
		DateFormat format = new DateFormat();
		format.outDate();

	}
}
