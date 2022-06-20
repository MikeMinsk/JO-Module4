package by.mikem.jonline.module4.aggregation.task04.logic;

import java.util.Collections;
import java.util.List;

import by.mikem.jonline.module4.aggregation.task04.entity.Account;
import by.mikem.jonline.module4.aggregation.task04.entity.Bank;
import by.mikem.jonline.module4.aggregation.task04.entity.Customer;
import by.mikem.jonline.module4.aggregation.task04.entity.CustomerFullName;
import by.mikem.jonline.module4.aggregation.task04.entity.CustomerComparatorByFullName;

public class BankLogic {

	public void addCustomer(Bank bank, Customer customer) {
		bank.getCustomers().add(customer);
	}

	public void sortCustomersByName(Bank bank) {
		Collections.sort(bank.getCustomers(), new CustomerComparatorByFullName());
	}

	public void sortAccountsByMoneyAmount(Bank bank) {
		CustomerLogic customerLogic = new CustomerLogic();

		for (Customer customer : bank.getCustomers()) {
			customerLogic.sortAccountsByMoneyAmount(customer);
		}
	}

	public Account findAccount(Bank bank, int accountNumber) {

		for (Customer customer : bank.getCustomers()) {
			for (Account account : customer.getAccounts()) {
				if (account.getAccountNumber() == accountNumber) {
					return account;
				}
			}
		}

		return null;
	}

	public Customer findCustomer(Bank bank, CustomerFullName fullName) {
		CustomerComparatorByFullName comparator = new CustomerComparatorByFullName();
		Customer tempCustomer = new Customer(fullName);

		for (Customer customer : bank.getCustomers()) {

			if (comparator.compare(customer, tempCustomer) == 0) {
				return customer;
			}
		}

		return null;
	}

	public List<Account> findAccountsOfCustomer(Bank bank, CustomerFullName fullName) {
		Customer customer = findCustomer(bank, fullName);

		if (customer != null) {
			return customer.getAccounts();
		}

		return null;
	}

	public double calculatePositiveAmount(Bank bank) {
		double totalAmount = 0;

		for (Customer customer : bank.getCustomers()) {
			for (Account account : customer.getAccounts()) {
				if (account.getAccountAmount() > 0) {
					totalAmount += account.getAccountAmount();
				}
			}
		}

		return totalAmount;
	}

	public double calculateNegativeAmount(Bank bank) {
		double totalAmount = 0;

		for (Customer customer : bank.getCustomers()) {
			for (Account account : customer.getAccounts()) {
				if (account.getAccountAmount() < 0) {
					totalAmount += account.getAccountAmount();
				}
			}
		}

		return totalAmount;
	}

	public double calculateTotalAmount(Bank bank) {
		return calculateNegativeAmount(bank) + calculatePositiveAmount(bank);
	}
}
