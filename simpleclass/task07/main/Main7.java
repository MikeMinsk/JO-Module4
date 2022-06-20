package by.mikem.jonline.module4.simpleclass.task07.main;

import by.mikem.jonline.module4.simpleclass.task07.entity.Point;
import by.mikem.jonline.module4.simpleclass.task07.entity.Triangle;
import by.mikem.jonline.module4.simpleclass.task07.logic.TriangleLogic;

public class Main7 {

	public static void main(String[] args) {
		Point a = new Point(-4, -1);
		Point b = new Point(-2, 1);
		Point c = new Point(2, 1);

		Triangle triangle = new Triangle(a, b, c);

		TriangleLogic triangleLogic = new TriangleLogic();

		if (triangleLogic.isTriangleExist(triangle)) {

			double area = triangleLogic.calculateArea(triangle);

			System.out.println("Triangle`s area = " + area);

			double perimeter = triangleLogic.calculatePerimeter(triangle);

			System.out.println("Triangle`s perimeter = " + perimeter);

			Point median = triangleLogic.calculateMedianPoint(triangle);

			System.out.println("Triangle`s perimeter = " + median.toString());
		}
	}
}
