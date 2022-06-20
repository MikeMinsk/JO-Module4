package by.mikem.jonline.module4.simpleclass.task08.main;

import java.util.List;

import by.mikem.jonline.module4.simpleclass.task08.entity.Bank;
import by.mikem.jonline.module4.simpleclass.task08.entity.Customer;
import by.mikem.jonline.module4.simpleclass.task08.logic.BankLogic;

/*Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами 
и методами. Задать критерии выбора данных и вывести эти данные на консоль. 
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
Найти и вывести: 
a) список покупателей в алфавитном порядке; 
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале*/

public class Main8 {

	public static void main(String[] args) {
		Bank bank = new Bank();		
		BankLogic bankLogic = new BankLogic();		

		bankLogic.addCustomer(bank, new Customer(1, "Иванов", "Иван", "Иванович", "Иваново", 111111, 1111111));
		bankLogic.addCustomer(bank, new Customer(2, "Сидоров", "Сидор", "Сидорович", "Сидорово", 222222, 2222222));
		bankLogic.addCustomer(bank, new Customer(3, "Петров", "Петр", "Петрович", "Петрово", 333333, 3333333));
		bankLogic.addCustomer(bank, new Customer(4, "Дятлов", "Дятел", "Дятлович", "Дятлово", 444444, 4444444));
		bankLogic.addCustomer(bank, new Customer(5, "Тарасов", "Тарас", "Тарасович", "Тарасово", 555555, 5555555));
		bankLogic.addCustomer(bank, new Customer(6, "Николаев", "Игорь", "Николаевич", "Николаево", 666666, 6666666));		

		bankLogic.sortCustomersByName(bank);

		printBank(bank);

		printBank(bankLogic.chooseCustomersByCardNumber(bank, 333333, 555555));
	}

	private static void printBank(Bank bank) {
		if (bank == null || bank.getCustomers().size() == 0) {
			System.out.println("Nothing to print!");
		}

		List<Customer> customers = bank.getCustomers();

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}

		System.out.println("--------------------------");
	}
}
