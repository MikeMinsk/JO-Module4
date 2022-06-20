package by.mikem.jonline.module4.simpleclass.task07.logic;

import by.mikem.jonline.module4.simpleclass.task07.entity.Point;
import by.mikem.jonline.module4.simpleclass.task07.entity.Triangle;

public class TriangleLogic {

	public boolean isTriangleExist(Triangle triangle) {
		if (calculateArea(triangle) == 0) {
			return false;
		}

		return true;
	}

	public double calculateArea(Triangle triangle) {
		double[] x = triangle.getXPoints();
		double[] y = triangle.getYPoints();

		double square;

		square = (((x[0] - x[1]) * (y[2] - y[1])) - ((x[2] - x[1]) * (y[0] - y[1])));
		square = 0.5 * Math.abs(square);

		return square;
	}

	public double calculatePerimeter(Triangle triangle) {
		double firstSideLength;
		double secondSideLength;
		double thirdSideLength;

		firstSideLength = calculateSideLength(triangle.getVertexA(), triangle.getVertexB());
		secondSideLength = calculateSideLength(triangle.getVertexA(), triangle.getVertexC());
		thirdSideLength = calculateSideLength(triangle.getVertexB(), triangle.getVertexC());

		return firstSideLength + secondSideLength + thirdSideLength;
	}

	public Point calculateMedianPoint(Triangle triangle) {
		double[] x = triangle.getXPoints();
		double[] y = triangle.getYPoints();

		double medianX;
		double medianY;

		medianX = (x[0] + x[1] + x[2]) / 3;
		medianY = (y[0] + y[1] + y[2]) / 3;

		return new Point(medianX, medianY);
	}

	private double calculateSideLength(Point vertexOne, Point vertexTwo) {
		double sideLength;

		sideLength = Math.pow((vertexTwo.getX() - vertexOne.getX()), 2);
		sideLength += Math.pow((vertexTwo.getY() - vertexOne.getY()), 2);
		sideLength = Math.sqrt(sideLength);

		return sideLength;
	}
}
