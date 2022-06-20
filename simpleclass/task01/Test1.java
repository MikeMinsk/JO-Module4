package by.mikem.jonline.module4.simpleclass.task01;

/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных
*/

public class Test1 {
	private int first;
	private int second;

	public Test1(int first, int second) {
		this.first = first;
		this.second = second;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void print() {
		System.out.println("The first variable = " + this.first + "\nThe second variable = " + this.second);
	}

	public int sum() {
		return this.first + this.second;
	}

	public int findMax() {
		return this.first > this.second ? this.first : this.second;
	}
}
