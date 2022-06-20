package by.mikem.jonline.module4.aggregation.task02.entity;

import java.util.Objects;

public class Engine {
	private Fuel fuelType;
	private int power;
	private double volume;

	public Engine() {
	}

	public Engine(Fuel fuelType, int power, double volume) {
		this.fuelType = fuelType;
		this.power = power;
		this.volume = volume;
	}

	public Fuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(Fuel fuelType) {
		this.fuelType = fuelType;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fuelType, power, volume);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Engine other = (Engine) obj;
		return Objects.equals(fuelType, other.fuelType) && power == other.power
				&& Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}

	@Override
	public String toString() {
		return String.format("Engine [model=%s, power=%s, volume=%s]", fuelType, power, volume);
	}
}
