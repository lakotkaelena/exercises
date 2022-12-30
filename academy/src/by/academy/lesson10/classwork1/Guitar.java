package by.academy.lesson10.classwork1;
/*
 * Гитара содержит переменные класса количествоСтрун,  
 */
public class Guitar implements Instrument {
	private String type;
	private int numberOfStrings;
	
	public Guitar() {
		
	}
	public Guitar(String type,int numberOfStrings) {
		this.type=type;
		this.numberOfStrings=numberOfStrings;
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	public void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings=numberOfStrings;
	}
	public void play() {
		System.out.println("Играет "+ type + ", число струн - "+ numberOfStrings);
	}
}
