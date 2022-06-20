package by.mikem.jonline.module4.simpleclass.task07.entity;

import java.util.Arrays;
import java.util.Objects;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
площади, периметра и точки пересечения медиан.*/

public class Triangle {
	private Point vertexA;
	private Point vertexB;
	private Point vertexC;
	private double[] xPoints;
	private double[] yPoints;

	public Triangle() {
		this.vertexA = new Point(0, 0);
		this.vertexB = new Point(10, 0);
		this.vertexC = new Point(0, 10);
		this.xPoints = getX(vertexA, vertexB, vertexC);
		this.yPoints = getY(vertexA, vertexB, vertexC);
	}

	public Triangle(Point vertexA, Point vertexB, Point vertexC) {
		this.vertexA = vertexA;
		this.vertexB = vertexB;
		this.vertexC = vertexC;
		this.xPoints = getX(vertexA, vertexB, vertexC);
		this.yPoints = getY(vertexA, vertexB, vertexC);
	}

	public Point getVertexA() {
		return vertexA;
	}

	public Point getVertexB() {
		return vertexB;
	}

	public Point getVertexC() {
		return vertexC;
	}

	public void setVertexA(Point vertexA) {
		this.vertexA = vertexA;
	}

	public void setVertexB(Point vertexB) {
		this.vertexB = vertexB;
	}

	public void setVertexC(Point vertexC) {
		this.vertexC = vertexC;
	}

	public double[] getXPoints() {
		return xPoints;
	}

	public double[] getYPoints() {
		return yPoints;
	}

	public void setxPoints(double[] xPoints) {
		this.xPoints = xPoints;
	}

	public void setyPoints(double[] yPoints) {
		this.yPoints = yPoints;
	}

	private double[] getX(Point vertexA, Point vertexB, Point vertexC) {
		double[] x = new double[3];

		x[0] = vertexA.getX();
		x[1] = vertexB.getX();
		x[2] = vertexC.getX();

		return x;
	}

	private double[] getY(Point vertexA, Point vertexB, Point vertexC) {
		double[] y = new double[3];

		y[0] = vertexA.getY();
		y[1] = vertexB.getY();
		y[2] = vertexC.getY();

		return y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(xPoints);
		result = prime * result + Arrays.hashCode(yPoints);
		result = prime * result + Objects.hash(vertexA, vertexB, vertexC);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Objects.equals(vertexA, other.vertexA) && Objects.equals(vertexB, other.vertexB)
				&& Objects.equals(vertexC, other.vertexC) && Arrays.equals(xPoints, other.xPoints)
				&& Arrays.equals(yPoints, other.yPoints);
	}

	@Override
	public String toString() {
		return String.format("Triangle [vertexA=%s, vertexB=%s, vertexC=%s, xPoints=%s, yPoints=%s]", vertexA, vertexB,
				vertexC, Arrays.toString(xPoints), Arrays.toString(yPoints));
	}
}
