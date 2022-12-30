package by.academy.lesson10.classwork1;
/*
 * Барабан - размер
 */
public class Drum implements Instrument{
	private String type;
	private int size;
	
	public Drum() {
		
	}
	public Drum(String type,int size) {
		this.type=type;
		this.size=size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size=size;
	}
	public void play() {
		System.out.println("Играет "+ type + ", размер - "+ size);
	}
}
