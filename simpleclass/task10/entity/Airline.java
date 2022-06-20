package by.mikem.jonline.module4.simpleclass.task10.entity;

import java.util.Objects;

import by.mikem.jonline.module4.simpleclass.task06.Time;

public class Airline {
	private String destination;
	private String flightNumber;
	private String aircraftType;
	private Time departureTime;
	private String dayOfWeek;

	public Airline(String destination, String flightNumber, String aircraftType, Time departureTime, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aircraftType, dayOfWeek, departureTime, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		return Objects.equals(aircraftType, other.aircraftType) && Objects.equals(dayOfWeek, other.dayOfWeek)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& Objects.equals(flightNumber, other.flightNumber);
	}

	@Override
	public String toString() {
		return String.format(
				"Airline [destination=%s, flightNumber=%s, aircraftType=%s, departureTime=%s, dayOfWeek=%s]",
				destination, flightNumber, aircraftType, departureTime, dayOfWeek);
	}
}
