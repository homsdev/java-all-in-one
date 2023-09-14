package com.homsdev.threads.lostupdate;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Balance {
	int balance = 0;

	public synchronized void increment() {
		balance++;
	}
}

public class LostUpdate {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(6);

		Balance balance = new Balance();

		for (int i = 0; i < 1000000; i++) {
			pool.execute(() -> balance.increment());
		}
		pool.shutdown();
		if (pool.awaitTermination(2, TimeUnit.MINUTES)) {
			System.out.printf("Balance = %d", balance.balance);
		}
	}
}
