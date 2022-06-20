package by.mikem.jonline.module4.simpleclass.task10.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.simpleclass.task06.Time;
import by.mikem.jonline.module4.simpleclass.task10.entity.Airline;
import by.mikem.jonline.module4.simpleclass.task10.entity.Airport;

public class AirportLogic {

	public void addAirline(Airport airport, Airline airline) {
		airport.getAirlines().add(airline);
	}

	public boolean removeAirline(Airport airport, Airline airline) {
		return airport.getAirlines().remove(airline);
	}

	public Airport getAirlinesByDestination(Airport airport, String destination) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> chosenAirlines = new ArrayList<Airline>();

		for (Airline airline : airlines) {
			if (airline.getDestination().equals(destination)) {
				chosenAirlines.add(airline);
			}
		}

		return new Airport(chosenAirlines);
	}

	public Airport getAirlinesByDayOfWeek(Airport airport, String dayOfWeek) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> chosenAirlines = new ArrayList<Airline>();

		for (Airline airline : airlines) {

			for (String splitedDayOfWeek : splitDaysOfWeek(airline.getDayOfWeek())) {

				if (splitedDayOfWeek.equals(dayOfWeek)) {
					chosenAirlines.add(airline);
				}
			}
		}

		return new Airport(chosenAirlines);
	}

	public Airport getAirlinesByDayOfWeekAndTime(Airport airport, String dayOfWeek, Time startTime) {
		List<Airline> airlines = airport.getAirlines();
		List<Airline> chosenAirlines = new ArrayList<Airline>();

		for (Airline airline : airlines) {

			for (String splitedDayOfWeek : splitDaysOfWeek(airline.getDayOfWeek())) {

				if (splitedDayOfWeek.equals(dayOfWeek) && airline.getDepartureTime().compareTo(startTime) == 1) {
					chosenAirlines.add(airline);
				}
			}
		}

		return new Airport(chosenAirlines);
	}

	private String[] splitDaysOfWeek(String daysOfWeek) {
		return daysOfWeek.split(", ");
	}
}
