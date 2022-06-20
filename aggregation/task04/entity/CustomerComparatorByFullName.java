package by.mikem.jonline.module4.aggregation.task04.entity;

import java.util.Comparator;

public class CustomerComparatorByFullName implements Comparator<Customer> {

	@Override
	public int compare(Customer customer1, Customer customer2) {
		CustomerFullName fullName1 = customer1.getCustomer();
		CustomerFullName fullName2 = customer2.getCustomer();

		if (fullName1.getSurmame().compareTo(fullName2.getSurmame()) == 0) {
			if (fullName1.getFirstName().compareTo(fullName2.getFirstName()) == 0) {
				if (fullName1.getPatronymic().compareTo(fullName2.getPatronymic()) == 0) {
					return 0;
				}

				return fullName1.getPatronymic().compareTo(fullName2.getPatronymic());
			}

			return fullName1.getFirstName().compareTo(fullName2.getFirstName());
		}

		return fullName1.getSurmame().compareTo(fullName2.getSurmame());
	}
}
