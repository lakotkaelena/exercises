package by.academy.lesson10.classwork1;

public class Application1 {

	public static void main(String[] args) {
		/*
		 * Создать массив типа Инструмент, содержащий инструменты разного типа.
		 */
		Instrument[] instruments = new Instrument[6];
		instruments[0] = new Guitar("Классическая гитара", 6);
		instruments[1] = new Guitar("Электроакустическая гитара", 7);
		instruments[2] = new Drum("Большой барабан", 50);
		instruments[3] = new Drum("Малый барабан", 30);
		instruments[4] = new Trumpet("Альтовая труба", 15);
		instruments[5] = new Trumpet("Басовая труба", 10);
		/*
		 * В цикле вызвать метод play() для каждого инструмента, который должен выводить
		 * строку "Играет такой-то инструмент c такими то характеристиками".
		 * 
		 */
		for (Instrument p : instruments) {
			p.play();
		}
	}

}
