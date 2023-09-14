package com.homsdev.threads.producersconsumers;

public class HomsDevTestProducersAndConsumers {
	public static void main(String[] args) throws InterruptedException {
		HomsDevResource resource = new HomsDevResource();

		HomsDevConsumer consumer1 = new HomsDevConsumer(resource, "Consumer 1");
		HomsDevConsumer consumer2 = new HomsDevConsumer(resource, "Consumer 2");

		HomsDevProducer producer1 = new HomsDevProducer(resource, "Producer 1");
		HomsDevProducer producer2 = new HomsDevProducer(resource, "Producer 2");
		
		producer1.start();
		producer2.start();
		
		consumer1.start();
		consumer2.start();
	}
}
