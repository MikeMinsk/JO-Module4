package by.mikem.jonline.module4.simpleclass.task05;

public class DecimalCounterLogic {

	public DecimalCounter createDecimalCounter(int currentCount, int lowerLimit, int upperLimit) {
		if (isCorrectValues(currentCount, lowerLimit, upperLimit)) {
			return new DecimalCounter(currentCount, lowerLimit, upperLimit);
		}
		return new DecimalCounter();
	}

	public void increaseCount(DecimalCounter decimalCounter) {
		int currentCount = decimalCounter.getCurrentCount();

		if (isCorrectCount(decimalCounter)) {
			decimalCounter.setCurrentCount(currentCount + 1);
		}
	}

	public void decreaseCount(DecimalCounter decimalCounter) {
		int currentCount = decimalCounter.getCurrentCount();

		if (isCorrectCount(decimalCounter)) {
			decimalCounter.setCurrentCount(currentCount - 1);
		}
	}

	private boolean isCorrectCount(DecimalCounter decimalCounter) {
		int currentCount = decimalCounter.getCurrentCount();
		int upperLimit = decimalCounter.getUpperLimit();
		int lowerLimit = decimalCounter.getLowerLimit();

		if (currentCount >= upperLimit | currentCount <= lowerLimit) {
			return false;
		}

		return true;
	}

	private boolean isCorrectValues(int currentCount, int lowerLimit, int upperLimit) {
		if (currentCount >= lowerLimit && lowerLimit < upperLimit && currentCount < upperLimit) {
			return true;
		}
		return false;
	}
}
