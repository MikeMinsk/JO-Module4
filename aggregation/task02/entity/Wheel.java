package by.mikem.jonline.module4.aggregation.task02.entity;

import java.util.Objects;

public class Wheel {
	private int diameter;
	private WheelSeason wheelSeason;
	private WheelManufacturer wheelManufacturer;

	public Wheel() {
	}

	public Wheel(int diameter, WheelSeason wheelSeason, WheelManufacturer wheelManufacturer) {
		this.diameter = diameter;
		this.wheelSeason = wheelSeason;
		this.wheelManufacturer = wheelManufacturer;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public WheelSeason getWheelSeason() {
		return wheelSeason;
	}

	public void setWheelSeason(WheelSeason wheelSeason) {
		this.wheelSeason = wheelSeason;
	}

	public WheelManufacturer getWheelManufacturer() {
		return wheelManufacturer;
	}

	public void setWheelManufacturer(WheelManufacturer wheelManufacturer) {
		this.wheelManufacturer = wheelManufacturer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diameter, wheelManufacturer, wheelSeason);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		return diameter == other.diameter && wheelManufacturer == other.wheelManufacturer
				&& wheelSeason == other.wheelSeason;
	}

	@Override
	public String toString() {
		return String.format("Wheel [diameter=%s, wheelSeason=%s, wheelManufacturer=%s]", diameter, wheelSeason,
				wheelManufacturer);
	}
}
