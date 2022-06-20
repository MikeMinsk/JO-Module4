package by.mikem.jonline.module4.simpleclass.task05;

import java.util.Objects;

public class DecimalCounter {
	private int currentCount;
	private int lowerLimit;
	private int upperLimit;

	public DecimalCounter() {
		this(0, 0, 10);
	}

	public DecimalCounter(int currentCount, int lowerLimit, int upperLimit) {		
		this.currentCount = currentCount;
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}	

	public int getCurrentCount() {
		return currentCount;
	}

	public void setCurrentCount(int currentCount) {
		this.currentCount = currentCount;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(currentCount, lowerLimit, upperLimit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DecimalCounter other = (DecimalCounter) obj;
		return currentCount == other.currentCount && lowerLimit == other.lowerLimit && upperLimit == other.upperLimit;
	}

	@Override
	public String toString() {
		return String.format("DecimalCounter [currentCount=%s, lowerLimit=%s, upperLimit=%s]", currentCount, lowerLimit,
				upperLimit);
	}	
}
