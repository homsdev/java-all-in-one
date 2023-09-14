package com.homsdev.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


class BankAccount {
	private final AtomicInteger balance = new AtomicInteger(100);

	public AtomicInteger getBalance() {
		return balance;
	}

	public void spend(String name, int amount) {
		int initialBalance = balance.get();
		if (initialBalance >= amount) {
			boolean success = balance.compareAndSet(initialBalance, initialBalance - amount);
			if (!success) {
				System.out.printf("Transaction was not completed: %s \n", name);
			}
		} else {
			System.out.printf("Not enough founds: %s \n", name);
		}
	}

}

class RyanAndMonicaJob implements Runnable {

	private BankAccount account;
	private String name;
	private Integer amountToSpend;

	public RyanAndMonicaJob(BankAccount account, String name, Integer amountToSpend) {
		this.account = account;
		this.name = name;
		this.amountToSpend = amountToSpend;
	}

	public void goShopping(Integer amount) {
		System.out.printf("%s is about to spend: %d \n", name, amount);
		account.spend(name, amount);
		System.out.printf("%s completed transaction \n", name);
	}

	@Override
	public void run() {
		goShopping(amountToSpend);
	}

}

public class ExampleOfAtomicBank {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		RyanAndMonicaJob ryan = new RyanAndMonicaJob(account, "Ryan", 50);
		RyanAndMonicaJob monika = new RyanAndMonicaJob(account, "Monika", 100);
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(monika);
		executor.execute(ryan);		
		executor.shutdown();
	}
}
