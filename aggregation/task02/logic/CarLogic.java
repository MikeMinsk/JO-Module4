package by.mikem.jonline.module4.aggregation.task02.logic;

import by.mikem.jonline.module4.aggregation.task02.entity.Car;
import by.mikem.jonline.module4.aggregation.task02.entity.Wheel;

public class CarLogic {
	public void changeAllWheels(Car car, Wheel newWheel) {
		for (int i = 1; i <= 4; i++) {
			changeWheel(car, newWheel, i);
		}
	}

	public void changeWheel(Car car, Wheel newWheel, int position) {
		Wheel[] wheels = car.getWheel();

		wheels[position - 1] = newWheel;
	}

	public boolean refuel(Car car) {
		int fuelCapacity = car.getFuelCapacity();

		if (car.getFuelResidue() < fuelCapacity) {
			car.setFuelResidue(fuelCapacity);
			return true;
		}

		return false;
	}

	public boolean startRiding(Car car) {
		if (startEngine(car) && checkCar(car)) {
			car.setReadyToRide(true);
			return true;
		}

		return false;
	}

	public boolean startEngine(Car car) {
		if (car.getFuelResidue() > 0) {
			car.setStartedEngine(true);
			return true;
		}

		return false;
	}

	public boolean checkCar(Car car) {
		Wheel[] wheels = car.getWheel();
		boolean isCarReady = true;

		for (Wheel wheel : wheels) {
			if (wheel == null) {
				isCarReady = false;
			}
		}

		return isCarReady;
	}
}
