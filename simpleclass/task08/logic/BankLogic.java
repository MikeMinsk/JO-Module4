package by.mikem.jonline.module4.simpleclass.task08.logic;

import java.util.ArrayList;
import java.util.List;

import by.mikem.jonline.module4.simpleclass.task08.entity.Bank;
import by.mikem.jonline.module4.simpleclass.task08.entity.Customer;

public class BankLogic {

	public void addCustomer(Bank bank, Customer customer) {
		bank.getCustomers().add(customer);
	}

	public boolean removeCustomer(Bank bank, Customer customer) {
		return bank.getCustomers().remove(customer);
	}

	public void sortCustomersByName(Bank bank) {
		List<Customer> unsortedCustomers = bank.getCustomers();
		List<Customer> sortedCustomers = new ArrayList<Customer>();

		while (unsortedCustomers.size() != 0) {
			Customer tempCustomer = unsortedCustomers.get(0);

			for (Customer customer : unsortedCustomers) {
				if (customer.compareTo(tempCustomer) < 0) {
					tempCustomer = customer;
				}
			}

			sortedCustomers.add(tempCustomer); // добавляем в сортированный список клиентов
			unsortedCustomers.remove(tempCustomer); // удаляем добавленного клиента из несортированного списка
		}

		bank.setCustomers(sortedCustomers);
	}

	public Bank chooseCustomersByCardNumber(Bank bank, long lowerLimit, long upperLimit) {
		List<Customer> customers = bank.getCustomers();
		List<Customer> chosenCustomers = new ArrayList<Customer>();

		for (Customer customer : customers) {
			if (customer.getCardNumber() >= lowerLimit && customer.getCardNumber() <= upperLimit) {
				chosenCustomers.add(customer);
			}
		}
		return new Bank(chosenCustomers);
	}
}
