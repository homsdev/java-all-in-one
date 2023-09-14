package com.homsdev.threads.sharedbankaccount;

/**
 * Synchronization is about objects and classes not methods
 */
public class BankAccount {

	private Integer balance = 100;

	public Integer getBalance() {
		return balance;
	}

	public void spend(Integer amount) {
		this.balance = this.balance - amount;
		if (balance < 0) {
			System.out.println("Overdrawn!");
		}
	}

	public synchronized void spendAlternative(Integer amount,String name) {
		if (balance >= amount) {
			balance = balance - amount;
			if (balance < 0) {
				System.err.println("Overdrawn!!");
			}
		} else {
			System.out.printf("Not enough founds for %s \n",name);
		}
	}

}
