package com.homsdev.threads.producersconsumers;

import java.util.Random;

public class HomsDevConsumer extends Thread {

	private HomsDevResource resource;

	public HomsDevConsumer(HomsDevResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String value = resource.consume();
				System.out.printf("%s consumed value: %s \n", getName(), value);
				Thread.sleep(new Random().nextInt(200));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
