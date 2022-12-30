package by.academy.lesson10.classwork1;
/*
 * Труба - диаметр. 
 */
public class Trumpet implements Instrument {
	private String type;

	private int diameter;

	public Trumpet() {

	}

	public Trumpet(String type, int diameter) {
		this.type = type;
		this.diameter = diameter;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public void play() {
		System.out.println("Играет "+ type + ", диаметр - "+ diameter);
	}
}
