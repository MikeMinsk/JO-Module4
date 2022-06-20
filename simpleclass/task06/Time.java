package by.mikem.jonline.module4.simpleclass.task06;

import java.util.Objects;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes) {
		setHours(hours);
		setMinutes(minutes);
	}

	public Time(int hours, int minutes, int seconds) {
		this(hours, minutes);
		setSeconds(seconds);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (isCorrectHours(hours)) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (isCorrectValue(minutes)) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (isCorrectValue(seconds)) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}

	private boolean isCorrectHours(int hours) {
		int moduleOfValue = Math.abs(hours);

		if (moduleOfValue >= 0 && moduleOfValue <= 23) {
			return true;
		}
		return false;
	}

	private boolean isCorrectValue(int value) {
		int moduleOfValue = Math.abs(value);

		if (moduleOfValue >= 0 && moduleOfValue <= 59) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("Time [hours=%s, minutes=%s, seconds=%s]", hours, minutes, seconds);
	}

	public int compareTo(Time time) { // метод для 4ой задачи
		if (this.hours == time.getHours() && this.minutes == time.getMinutes() && this.seconds == time.getSeconds()) {
			return 0;

		} else if (this.hours > time.getHours()) {
			return 1;

		} else if (this.hours == time.getHours()) {
			if (this.minutes > time.getMinutes()) {
				return 1;

			} else if (this.minutes == time.getMinutes()) {
				if (this.seconds > time.getSeconds()) {
					return 1;
				}
			}
		}

		return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes, seconds);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
	}
}
