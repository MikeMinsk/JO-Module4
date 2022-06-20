package by.mikem.jonline.module4.simpleclass.task04.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import by.mikem.jonline.module4.simpleclass.task06.Time;

public class RailwayStation {
	List<Train> trains;

	public RailwayStation() {
		this.trains = new ArrayList<Train>();
	}

	public RailwayStation(List<Train> trains) {
		this.trains = trains;
	}

	public List<Train> getTrains() {
		return this.trains;
	}

	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public void addTrain(String destination, int trainNumber, Time departureTime) {
		Train train = new Train(destination, trainNumber, departureTime);

		if (trains.size() < 5) {
			trains.add(train);
		} else {
			return;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(trains);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RailwayStation other = (RailwayStation) obj;
		return Objects.equals(trains, other.trains);
	}

	@Override
	public String toString() {
		return String.format("RailwayStation [trains=%s]", trains);
	}	
}
