package com.homsdev.threads;

class CounterWithLifeCycle implements Runnable {

	private Integer value;

	public CounterWithLifeCycle(Integer value) {
		super();
		this.value = value;
	}

	@Override
	public void run() {
		System.out.printf("2.- %s \n",Thread.currentThread().getState());
		for (int i = value; i >= 0; i--) {
			System.out.printf("%s : %d \n", Thread.currentThread().getName(), i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

/**
 * Once a thread is started it cannot be started again
 */
public class ExampleOfThreadLifeCycle {

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new CounterWithLifeCycle(3), "CounterThread");
		System.out.printf("1.- %s \n", thread1.getState());
		thread1.start();
		thread1.join();
		System.out.printf("4.- %s \n", thread1.getState());
		thread1.start();
	}
}
