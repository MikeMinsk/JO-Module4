package by.mikem.jonline.module4.simpleclass.task01;

public class Main1 {//для теста класса Test1

	public static void main(String[] args) {
		Test1 testOne = new Test1(10, 10);

		testOne.print();

		int sum;

		sum = testOne.sum();

		System.out.println("The sum = " + sum);

		int maxVariable;

		maxVariable = testOne.findMax();

		System.out.println("The max variable = " + maxVariable);
	}
}
