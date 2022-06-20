package by.mikem.jonline.module4.aggregation.task05.logic;

import java.util.Random;

import by.mikem.jonline.module4.aggregation.task05.entity.Tour;
import by.mikem.jonline.module4.aggregation.task05.entity.TourMeal;
import by.mikem.jonline.module4.aggregation.task05.entity.TourTrans;
import by.mikem.jonline.module4.aggregation.task05.entity.TourType;

public class TourLogic {

	public Tour createTour() {
		TourType tourType = generateTourType();
		int price = generateTourPrice();
		TourTrans tourTrans = generateTourTransport();
		TourMeal tourMeal = generateTourMeal();
		
		return new Tour(tourType, price, tourTrans, tourMeal);
	}

	private int generateTourDays() {
		return new Random().nextInt(16) + 5;
	}

	private TourTrans generateTourTransport() {
		TourTrans[] transports = TourTrans.values();

		int chosenTransport = new Random().nextInt(transports.length);

		return transports[chosenTransport];
	}

	private TourType generateTourType() {
		TourType[] types = TourType.values();

		int chosenType = new Random().nextInt(types.length);

		return types[chosenType];
	}

	private TourMeal generateTourMeal() {
		TourMeal[] meals = TourMeal.values();

		int chosenMeal = new Random().nextInt(meals.length);

		return meals[chosenMeal];
	}

	private int generateTourPrice() {
		return 25 * generateTourDays();
	}
}
