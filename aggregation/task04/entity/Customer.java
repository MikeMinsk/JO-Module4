package by.mikem.jonline.module4.aggregation.task04.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private static int customersCount = 1;
	private int customerID;
	private CustomerFullName customer;
	private List<Account> accounts;

	public Customer() {
	}

	public Customer(CustomerFullName customer) {
		this.customer = customer;
		this.accounts = new ArrayList<Account>();
		this.customerID = customersCount;
		customersCount++;
	}

	public Customer(CustomerFullName customer, List<Account> accounts) {
		this.customer = customer;
		this.accounts = accounts;
		this.customerID = customersCount;
		customersCount++;
	}

	public int getCustomerID() {
		return customerID;
	}

	public CustomerFullName getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerFullName customer) {
		this.customer = customer;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public static int getCustomersCount() {
		return customersCount;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + customerID;
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
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (customerID != other.customerID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Customer [customerID=%s, customer=%s, accounts=%s]", customerID, customer, accounts);
	}
}
