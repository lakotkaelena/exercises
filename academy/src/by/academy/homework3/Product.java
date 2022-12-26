package by.academy.homework3;

import java.util.Scanner;

public abstract class Product {
	private String type;
	private String name; // наименование товара
	private double price; // цена
	private int quantity; // количество товара
	private int discount;
	private int selectedCount; // выбранное пользователем количество товара

	public Product(String type, String name, double price, int quantity, int discount) { 
		
		this.type = type;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public String getType() {
		return type;
	}
	
	

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getSelectedCount() {
		return selectedCount;
	}

	public void setSelectedCount(int selectedCount) {
		this.selectedCount = selectedCount;
	}

	public double getPriceSelectedProduct() {

		return (price * selectedCount) - (((double) discount / 100) * (price * selectedCount));
	}

}
