package by.mikem.jonline.module4.simpleclass.task04.entity;

import java.util.Objects;

import by.mikem.jonline.module4.simpleclass.task06.Time;

public class Train {
	private String destination;
	private int trainNumber;
	private Time departureTime;

	public Train() {
		this.destination = "undefined";
		this.trainNumber = -1;
		this.departureTime = new Time(0, 0, 0);
	}

	public Train(String destination, int trainNumber, Time departureTime) {
		this.destination = destination;

		setTrainNumber(trainNumber);

		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setTrainNumber(int trainNumber) {
		if (trainNumber > 0) {
			this.trainNumber = trainNumber;
		} else {
			return;
		}
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public String toString() {
		return String.format("Train [destination=%s, trainNumber=%s, departureTime=%s]", destination, trainNumber,
				departureTime);
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destination, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& trainNumber == other.trainNumber;
	}

	public int compareTo(Train train) {
		int result = this.destination.compareTo(train.destination);

		if (result == 0) {
			result = this.departureTime.compareTo(train.departureTime);
		}
		return result;
	}
}
