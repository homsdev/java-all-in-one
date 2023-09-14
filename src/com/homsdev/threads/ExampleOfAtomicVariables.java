package com.homsdev.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * If the shared data is an int, long, or boolean, we might be able to replace
 * it with an atomic variable.
 */
class Balance {
	AtomicInteger balance = new AtomicInteger(0);

	public synchronized void increment() {
		balance.incrementAndGet();
	}
}

public class ExampleOfAtomicVariables {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService pool = Executors.newFixedThreadPool(6);

		Balance balance = new Balance();

		for (int i = 0; i < 1000000; i++) {
			pool.execute(() -> balance.increment());
		}
		pool.shutdown();
		if (pool.awaitTermination(2, TimeUnit.MINUTES)) {
			System.out.printf("Balance = %s", balance.balance.toString());
		}
	}
}
