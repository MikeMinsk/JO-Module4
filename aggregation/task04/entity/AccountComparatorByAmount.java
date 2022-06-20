package by.mikem.jonline.module4.aggregation.task04.entity;

import java.util.Comparator;

public class AccountComparatorByAmount implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		if (account1.getAccountAmount() - account2.getAccountAmount() > 0) {
			return -1;

		} else if (account1.getAccountAmount() - account2.getAccountAmount() < 0) {
			return 1;
		}

		return 0;
	}
}
