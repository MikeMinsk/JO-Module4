package by.mikem.jonline.module4.aggregation.task04.main;

import by.mikem.jonline.module4.aggregation.task04.entity.Account;
import by.mikem.jonline.module4.aggregation.task04.entity.Bank;
import by.mikem.jonline.module4.aggregation.task04.entity.Customer;
import by.mikem.jonline.module4.aggregation.task04.entity.CustomerFullName;
import by.mikem.jonline.module4.aggregation.task04.logic.BankLogic;
import by.mikem.jonline.module4.aggregation.task04.logic.CustomerLogic;

/*Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class Main04 {

	public static void main(String[] args) {
		Customer client1 = new Customer(new CustomerFullName("Иванов", "Иван", "Иванович"));
		Customer client2 = new Customer(new CustomerFullName("Сидоров", "Сидор", "Сидорович"));
		Customer client3 = new Customer(new CustomerFullName("Петров", "Петр", "Петрович"));
		Customer client4 = new Customer(new CustomerFullName("Николаев", "Николай", "Николаевич"));

		CustomerLogic customerLogic = new CustomerLogic();

		customerLogic.addAccountToCustomer(client1);
		customerLogic.addAccountToCustomer(client1);
		customerLogic.addAccountToCustomer(client1);
		customerLogic.addAccountToCustomer(client1);

		customerLogic.addAccountToCustomer(client2);
		customerLogic.addAccountToCustomer(client2);
		customerLogic.addAccountToCustomer(client2);

		customerLogic.addAccountToCustomer(client3);
		customerLogic.addAccountToCustomer(client3);

		customerLogic.addAccountToCustomer(client4);
		customerLogic.addAccountToCustomer(client4);
		customerLogic.addAccountToCustomer(client4);
		customerLogic.addAccountToCustomer(client4);

		Bank bank = new Bank();
		BankLogic bankLogic = new BankLogic();

		bankLogic.addCustomer(bank, client1);
		bankLogic.addCustomer(bank, client2);
		bankLogic.addCustomer(bank, client3);
		bankLogic.addCustomer(bank, client4);

		printBank(bank);

		bankLogic.sortCustomersByName(bank);
		bankLogic.sortAccountsByMoneyAmount(bank);

		System.out.println("\nThe bank after sorting by customers names and amounts of money in the accounts:");

		printBank(bank);

		System.out.println("\nThe accounts of [Николаев Николай Николаевич]:");

		printCustomerAccounts(bankLogic.findCustomer(bank, new CustomerFullName("Николаев", "Николай", "Николаевич")));

		System.out.println("\nThe total amount of money in the bank: " + bankLogic.calculateTotalAmount(bank));

		System.out.println("The total positive money balance in the bank: " + bankLogic.calculatePositiveAmount(bank));

		System.out.println("The total negative money balance in the bank: " + bankLogic.calculateNegativeAmount(bank));
	}

	private static void printCustomerAccounts(Customer customer) {
		System.out.println(customer.getCustomer().toString());

		for (Account account : customer.getAccounts()) {
			System.out.println(account.toString());
		}
	}

	private static void printBank(Bank bank) {
		for (Customer customer : bank.getCustomers()) {
			printCustomerAccounts(customer);
		}
	}
}
