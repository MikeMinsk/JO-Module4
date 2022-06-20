package by.mikem.jonline.module4.simpleclass.task05;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и 
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.*/

public class Main5 {

	public static void main(String[] args) {
		DecimalCounterLogic decimalCounterLogic = new DecimalCounterLogic();

		DecimalCounter counter = decimalCounterLogic.createDecimalCounter(-100, -100, 100);

		System.out.println("The current state of the counter: " + counter.getCurrentCount());

		decimalCounterLogic.increaseCount(counter);

		System.out.println("The current state of the counter: " + counter.getCurrentCount());

		decimalCounterLogic.decreaseCount(counter);

		System.out.println("The current state of the counter: " + counter.getCurrentCount());
	}
}
