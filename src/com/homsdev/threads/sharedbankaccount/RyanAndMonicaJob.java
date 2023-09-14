package com.homsdev.threads.sharedbankaccount;

/**
 * Remember to synchronize the method with the shared object between threads
 */
public class RyanAndMonicaJob implements Runnable {

	private BankAccount account;
	private String name;
	private Integer amountToSpend;

	public RyanAndMonicaJob(BankAccount account, String name, Integer amountToSpend) {
		this.account = account;
		this.name = name;
		this.amountToSpend = amountToSpend;
	}

	@Override
	public void run() {
		// goShopping(amountToSpend);
		goShoppingAlternative(amountToSpend);
	}

	public void goShopping(Integer amount) {
		synchronized (account) {
			if (account.getBalance() >= amount) {
				System.out.printf("%s is about to spend: %d \n", name, amount);
				account.spend(amount);
				System.out.printf("%s completed transaction \n", name);
			} else {
				System.out.printf("Not enough founds in banck account for %s", name);
			}
		}
	}

	public void goShoppingAlternative(Integer amount) {
		System.out.printf("%s is about to spend: %d \n", name, amount);
		account.spendAlternative(amount, name);
		System.out.printf("%s completed transaction \n", name);
	}

}
