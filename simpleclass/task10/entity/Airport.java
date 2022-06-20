package by.mikem.jonline.module4.simpleclass.task10.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airport {
	List<Airline> airlines;

	public Airport() {
		this.airlines = new ArrayList<Airline>();
	}

	public Airport(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public int hashCode() {
		return Objects.hash(airlines);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return Objects.equals(airlines, other.airlines);
	}

	@Override
	public String toString() {
		return String.format("Airport [airlines=%s]", airlines);
	}
}
