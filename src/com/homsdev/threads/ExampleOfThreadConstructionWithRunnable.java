package com.homsdev.threads;

class Counter implements Runnable {

	private int value;

	public Counter(int value) {
		super();
		this.value = value;
	}

	@Override
	public void run() {
		for (int i = value; i >= 0; i--) {
			System.out.printf("Thread: %s %d \n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}

}

public class ExampleOfThreadConstructionWithRunnable {
	public static void main(String[] args) {
		Thread counter1 = new Thread(new Counter(10), "Counter-1");
		Thread counter2 = new Thread(new Counter(20), "Counter-2");
		counter1.start();
		counter2.start();
		
		System.out.println("Fin del programa");
	}
}
