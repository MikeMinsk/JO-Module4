package by.mikem.jonline.module4.simpleclass.task08.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bank {
	List<Customer> customers;
	
	public Bank() {		
		this.customers = new ArrayList<Customer>();		
	}

	public Bank(List<Customer> customers) {		
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}	
	
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return String.format("Bank [customers=%s]", customers);
	}	
}
