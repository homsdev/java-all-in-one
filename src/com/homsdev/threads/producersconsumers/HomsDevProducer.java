package com.homsdev.threads.producersconsumers;

import java.util.Random;

public class HomsDevProducer extends Thread {
	private HomsDevResource resource;

	public HomsDevProducer(HomsDevResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Integer value = new Random().nextInt(100);
				System.out.printf(String.format("%s Produced value: %s \n", getName(), value.toString()));
				resource.produce(value.toString());
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
