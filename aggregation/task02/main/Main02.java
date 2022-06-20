package by.mikem.jonline.module4.aggregation.task02.main;

import by.mikem.jonline.module4.aggregation.task02.entity.Car;
import by.mikem.jonline.module4.aggregation.task02.entity.CarModel;
import by.mikem.jonline.module4.aggregation.task02.entity.Engine;
import by.mikem.jonline.module4.aggregation.task02.entity.Fuel;
import by.mikem.jonline.module4.aggregation.task02.entity.Wheel;
import by.mikem.jonline.module4.aggregation.task02.entity.WheelManufacturer;
import by.mikem.jonline.module4.aggregation.task02.entity.WheelSeason;
import by.mikem.jonline.module4.aggregation.task02.logic.CarLogic;

public class Main02 {

	public static void main(String[] args) {
		Engine engine1 = new Engine(Fuel.DIESEL, 120, 2.0);
		Engine engine2 = new Engine(Fuel.DIESEL, 320, 6.0);
		Engine engine3 = new Engine(Fuel.GASOLINE, 620, 6.0);
		Engine engine4 = new Engine(Fuel.GASOLINE, 9, 1.0);

		Car car1 = new Car(engine1, new Wheel[4], CarModel.GAZ, 1970, 0, 120, false, false);

		System.out.println(car1.toString());

		CarLogic carLogic = new CarLogic();

		carLogic.changeAllWheels(car1, new Wheel(20, WheelSeason.SUMMER, WheelManufacturer.BELSHINA));

		carLogic.changeWheel(car1, new Wheel(20, WheelSeason.SUMMER, WheelManufacturer.GOODYEAR), 3);

		carLogic.refuel(car1);

		boolean isCarMoving;

		isCarMoving = carLogic.startRiding(car1);

		System.out.println("The car is moving == " + isCarMoving);
		System.out.println(car1.toString());
	}
}
