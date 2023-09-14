package com.homsdev.threads;

/**
 * Execute simultaneous tasks extend Thread and override run method
 */
class HomsdevThread extends Thread {
	public HomsdevThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.printf("Hilo %s indice %d \n", getName(), i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

/**
 * To execute in simultaneous mode use start() method otherwise use run()
 */
public class ExampleOfThreadConstruction {
	public static void main(String[] args) {
		HomsdevThread thread1 = new HomsdevThread("Thread 1");
		HomsdevThread thread2 = new HomsdevThread("Thread 2");
		thread1.start();
		thread2.start();
	}
}
