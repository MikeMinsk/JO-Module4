package by.mikem.jonline.module4.aggregation.task04.entity;

public class Account {
	private int accountNumber;
	private double accountAmount;
	private boolean blocked;

	public Account() {
	}

	public Account(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Account(int accountNumber, double accountAmount) {
		this(accountNumber);
		this.accountAmount = accountAmount;
	}

	public Account(int accountNumber, double accountAmount, boolean blocked) {
		this(accountNumber, accountAmount);
		this.blocked = blocked;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountAmount() {
		return accountAmount;
	}

	public void setAccountAmount(double accountAmount) {
		this.accountAmount = accountAmount;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accountAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accountNumber;
		result = prime * result + (blocked ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(accountAmount) != Double.doubleToLongBits(other.accountAmount))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (blocked != other.blocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Account [accountNumber=%s, accountAmount=%s, blocked=%s]", accountNumber, accountAmount,
				blocked);
	}
}
