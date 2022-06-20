package by.mikem.jonline.module4.aggregation.task04.logic;

import java.util.Collections;

import by.mikem.jonline.module4.aggregation.task04.entity.Account;
import by.mikem.jonline.module4.aggregation.task04.entity.AccountComparatorByAmount;
import by.mikem.jonline.module4.aggregation.task04.entity.Customer;

public class CustomerLogic {

	public void sortAccountsByMoneyAmount(Customer customer) {
		Collections.sort(customer.getAccounts(), new AccountComparatorByAmount());
	}

	public void addAccountToCustomer(Customer customer) {
		AccountLogic accountLogic = new AccountLogic();

		customer.getAccounts().add(accountLogic.generateAccount());
	}

	public void addAccountToCustomer(Customer customer, Account account) {
		customer.getAccounts().add(account);
	}

	public boolean blockAccount(Customer customer, int accountNumber) {
		for (Account account : customer.getAccounts()) {

			if (account != null && account.getAccountNumber() == accountNumber) {
				account.setBlocked(true);

				return true;
			}
		}

		return false;
	}

	public boolean blockAccount(Customer customer) {
		for (Account account : customer.getAccounts()) {

			if (account == null) {
				return false;
			}

			account.setBlocked(true);
		}

		return true;
	}

	public double calculatePositiveAmount(Customer customer) {
		double totalAmount = 0;

		for (Account account : customer.getAccounts()) {
			if (account.getAccountAmount() > 0) {
				totalAmount += account.getAccountAmount();
			}
		}

		return totalAmount;
	}

	public double calculateNegativeAmount(Customer customer) {
		double totalAmount = 0;

		for (Account account : customer.getAccounts()) {
			if (account.getAccountAmount() < 0) {
				totalAmount += account.getAccountAmount();
			}
		}

		return totalAmount;
	}

	public double calculateTotalAmount(Customer customer) {
		return calculateNegativeAmount(customer) + calculatePositiveAmount(customer);
	}
}
