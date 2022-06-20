package by.mikem.jonline.module4.simpleclass.task10.main;

import java.util.List;

import by.mikem.jonline.module4.simpleclass.task06.Time;
import by.mikem.jonline.module4.simpleclass.task10.entity.Airline;
import by.mikem.jonline.module4.simpleclass.task10.entity.Airport;
import by.mikem.jonline.module4.simpleclass.task10.logic.AirportLogic;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и 
методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
Найти и вывести: 
a) список рейсов для заданного пункта назначения; 
b) список рейсов для заданного дня недели; 
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/

public class Main10 {

	public static void main(String[] args) {
		Airport airport = new Airport();
		AirportLogic airportLogic = new AirportLogic();

		airportLogic.addAirline(airport, new Airline("Minsk", "FN189", "Boeing 737-500", new Time(19, 14), "Monday"));
		airportLogic.addAirline(airport,
				new Airline("Moscow", "MS2213", "Boeing 777-300", new Time(5, 22), "Monday, Sunday"));
		airportLogic.addAirline(airport,
				new Airline("London", "LG15123", "Embraer Phenom 300", new Time(13, 3), "Monday, Saturday"));
		airportLogic.addAirline(airport,
				new Airline("Krupki", "AA1111", "Airbus A320", new Time(22, 11), "Monday, Wednesday, Friday"));
		airportLogic.addAirline(airport,
				new Airline("Beijing", "CN1193", "Antonov AN-32", new Time(13, 13), "Saturday, Sunday"));
		airportLogic.addAirline(airport,
				new Airline("Riga", "LV315", "Ilyushin IL96", new Time(15, 59), "Tuesday, Friday"));

		printAiport(airportLogic.getAirlinesByDestination(airport, "Krupki"));

		printAiport(airportLogic.getAirlinesByDayOfWeek(airport, "Sunday"));

		printAiport(airportLogic.getAirlinesByDayOfWeekAndTime(airport, "Monday", new Time(12, 0)));
	}

	private static void printAiport(Airport airport) {
		if (airport == null || airport.getAirlines().size() == 0) {
			System.out.println("Nothing to print!");
		}

		List<Airline> airlines = airport.getAirlines();

		for (Airline airline : airlines) {
			System.out.println(airline.toString());
		}

		System.out.println("--------------------------");
	}
}
