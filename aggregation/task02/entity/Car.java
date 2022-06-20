package by.mikem.jonline.module4.aggregation.task02.entity;

import java.util.Arrays;
import java.util.Objects;

public class Car {
	private Engine engine;
	private Wheel[] wheels;
	private final CarModel carModel;
	private final int manufactureYear;
	private int fuelResidue;
	private final int fuelCapacity;
	private boolean readyToRide;
	private boolean startedEngine;

	public Car() {
		this.manufactureYear = 1970;
		this.fuelCapacity = 50;
		this.carModel = CarModel.UNKNOWN;
	}

	public Car(Engine engine, Wheel[] wheel, CarModel carModel, int manufactureYear, int fuelResidue, int fuelCapacity,
			boolean readyToRide, boolean startedEngine) {
		super();
		this.engine = engine;
		this.wheels = wheel;
		this.carModel = carModel;
		this.manufactureYear = manufactureYear;
		this.fuelResidue = fuelResidue;
		this.fuelCapacity = fuelCapacity;
		this.readyToRide = readyToRide;
		this.startedEngine = startedEngine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel[] getWheel() {
		return wheels;
	}

	public void setWheel(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public int getFuelResidue() {
		return fuelResidue;
	}

	public void setFuelResidue(int fuelResidue) {
		this.fuelResidue = fuelResidue;
	}

	public boolean isReadyToRide() {
		return readyToRide;
	}

	public void setReadyToRide(boolean readyToRide) {
		this.readyToRide = readyToRide;
	}

	public boolean isStartedEngine() {
		return startedEngine;
	}

	public void setStartedEngine(boolean startedEngine) {
		this.startedEngine = startedEngine;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(wheels);
		result = prime * result + Objects.hash(carModel, engine, fuelCapacity, fuelResidue, manufactureYear,
				readyToRide, startedEngine);
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
		Car other = (Car) obj;
		return carModel == other.carModel && Objects.equals(engine, other.engine) && fuelCapacity == other.fuelCapacity
				&& fuelResidue == other.fuelResidue && manufactureYear == other.manufactureYear
				&& readyToRide == other.readyToRide && startedEngine == other.startedEngine
				&& Arrays.equals(wheels, other.wheels);
	}

	@Override
	public String toString() {
		return String.format(
				"Car [engine=%s, wheel=%s, carModel=%s, manufactureYear=%s, fuelResidue=%s, fuelCapacity=%s, readyToRide=%s, startedEngine=%s]",
				engine, Arrays.toString(wheels), carModel, manufactureYear, fuelResidue, fuelCapacity, readyToRide,
				startedEngine);
	}
}
