package by.mikem.jonline.module4.simpleclass.task08.entity;

import java.util.Objects;

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String adress;
	private long cardNumber;
	private long bankAccount;

	public Customer() {
	}

	public Customer(int id, String surname, String name, String patronymic, String adress, long cardNumber,
			long bankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [id=%s, surname=%s, name=%s, patronymic=%s, adress=%s, cardNumber=%s, bankAccount=%s]", id,
				surname, name, patronymic, adress, cardNumber, bankAccount);
	}

	public int compareTo(Customer customer) {
		int result = this.surname.compareTo(customer.surname);

		if (result == 0) {
			result = this.name.compareTo(customer.name);
		}

		if (result == 0) {
			result = this.patronymic.compareTo(customer.patronymic);
		}
		return result;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, bankAccount, cardNumber, id, name, patronymic, surname);
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
		return Objects.equals(adress, other.adress) && bankAccount == other.bankAccount
				&& cardNumber == other.cardNumber && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(patronymic, other.patronymic) && Objects.equals(surname, other.surname);
	}
}
