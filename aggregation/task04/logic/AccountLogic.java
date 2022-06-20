package by.mikem.jonline.module4.aggregation.task04.logic;

import by.mikem.jonline.module4.aggregation.task04.entity.Account;

public class AccountLogic {

	public Account generateAccount() {
		return new Account(generateAccountNumber(), generateAccountAmount());
	}

	private int generateAccountNumber() {
		return (int) (Math.random() * 10000000);
	}

	private double generateAccountAmount() {
		return ((Math.random() - 0.1) * 100000);
	}
}
