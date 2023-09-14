package com.homsdev.threads;

class CounterDesc {
	private static int countValue = 10;

	synchronized static void decrementCounter() {
		countValue--;
		System.out.println(countValue);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class CounterDescThread extends Thread {

	@Override
	public void run() {
		System.out.println("Decrementing...");
		CounterDesc.decrementCounter();
	}

}

public class ExampleOfSyncThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new CounterDescThread().start();
		}
	}
}
