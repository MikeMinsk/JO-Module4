package by.mikem.jonline.module4.simpleclass.task04.main;

import java.util.List;
import java.util.Scanner;

import by.mikem.jonline.module4.simpleclass.task04.entity.RailwayStation;
import by.mikem.jonline.module4.simpleclass.task04.entity.Train;
import by.mikem.jonline.module4.simpleclass.task04.logic.RailwayStationLogic;
import by.mikem.jonline.module4.simpleclass.task06.Time;

/* Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов 
 * массива по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен
 * пользователем. Добавьте возможность сортировки массив по пункту назначения, причем поезда с 
 * одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
*/

public class Main4 {

	public static void main(String[] args) {
		RailwayStation station = new RailwayStation();

		station.addTrain("Minsk", 967, new Time(9, 20));
		station.addTrain("Moscow", 21, new Time(13, 10));
		station.addTrain("Berlin", 316, new Time(6, 0));
		station.addTrain("Minsk", 45, new Time(19, 30));
		station.addTrain("Moscow", 523, new Time(13, 23));

		int trainToSearch; // ищем нужный поезд

		trainToSearch = getFromConsole();

		RailwayStationLogic desiredTrain = new RailwayStationLogic();

		String result;

		result = desiredTrain.searchTrain(station, trainToSearch).toString();

		System.out.println(result);

		RailwayStationLogic sortedTrains = new RailwayStationLogic();

		System.out.println("The list of trains sorted by its number:");

		sortedTrains.sortTrainsByNumber(station);

		printTrains(station);

		System.out.println("The list of trains sorted by destination:");

		sortedTrains.sortTrainsByDestinationAndTime(station);

		printTrains(station);
	}

	private static int getFromConsole() {// номер искомого поезда
		int number;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the train number to search >> ");

		do {
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Enter the train number to search >> ");
			}

			number = sc.nextInt();

			if (number <= 0) {
				sc.nextLine();
				System.out.print("Enter the train number to search >> ");
			}
		} while (number <= 0);

		return number;
	}

	private static void printTrains(RailwayStation station) {
		if (station == null || station.getTrains().size() == 0) {
			System.out.println("Nothing to print!");
		}

		List<Train> trains = station.getTrains();

		for (Train train : trains) {
			System.out.println(train.toString());
		}

		System.out.println("--------------------------");
	}
}
