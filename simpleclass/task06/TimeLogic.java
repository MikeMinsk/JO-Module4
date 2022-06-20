package by.mikem.jonline.module4.simpleclass.task06;

public class TimeLogic {

	public void increaseTime(Time time, int hours, int minutes, int seconds) {
		increaseSeconds(time, seconds);
		increaseMinutes(time, minutes);
		increaseHours(time, hours);
	}

	public void decreaseTime(Time time, int hours, int minutes, int seconds) {
		decreaseSeconds(time, seconds);
		decreaseMinutes(time, minutes);
		decreaseHours(time, hours);
	}

	public void increaseSeconds(Time time, int seconds) {
		if (isCorrectValue(seconds)) {
			int increasedSeconds = time.getSeconds() + seconds;

			if (increasedSeconds < 60) {
				time.setSeconds(increasedSeconds);
			} else {
				time.setSeconds(increasedSeconds - 60);
				increaseMinutes(time, 1);
			}
		} else {
			time.setSeconds(0);
		}
	}

	public void increaseMinutes(Time time, int minutes) {
		if (isCorrectValue(minutes)) {
			int increasedMinutes = time.getMinutes() + minutes;

			if (increasedMinutes < 60) {
				time.setMinutes(increasedMinutes);
			} else {
				time.setMinutes(increasedMinutes - 60);
				increaseHours(time, 1);
			}
		} else {
			time.setMinutes(0);
		}
	}

	public void increaseHours(Time time, int hours) {
		if (isCorrectHours(hours)) {
			int increasedHours = time.getHours() + hours;

			if (increasedHours < 24) {
				time.setHours(increasedHours);
			} else {
				time.setHours(increasedHours - 24);
			}
		} else {
			time.setHours(0);
		}
	}

	public void decreaseSeconds(Time time, int seconds) {
		if (isCorrectValue(seconds)) {
			int decreasedSeconds = time.getSeconds() - seconds;

			if (decreasedSeconds >= 0) {
				time.setSeconds(decreasedSeconds);
			} else {
				time.setSeconds(decreasedSeconds + 60);
				decreaseMinutes(time, 1);
			}
		} else {
			time.setSeconds(0);
		}
	}

	public void decreaseMinutes(Time time, int minutes) {
		if (isCorrectValue(minutes)) {
			int decreasedMinutes = time.getMinutes() - minutes;

			if (decreasedMinutes >= 0) {
				time.setMinutes(decreasedMinutes);
			} else {
				time.setMinutes(decreasedMinutes + 60);
				decreaseHours(time, 1);
			}
		} else {
			time.setMinutes(0);
		}
	}

	public void decreaseHours(Time time, int hours) {
		if (isCorrectHours(hours)) {
			int decreasedHours = time.getHours() - hours;

			if (decreasedHours >= 0) {
				time.setHours(decreasedHours);
			} else {
				time.setHours(decreasedHours + 24);
			}
		} else {
			time.setHours(0);
		}
	}

	private boolean isCorrectHours(int hours) {
		if (hours >= 0 && hours <= 23) {
			return true;
		}
		return false;
	}

	private boolean isCorrectValue(int value) {
		if (value >= 0 && value <= 59) {
			return true;
		}
		return false;
	}
}
