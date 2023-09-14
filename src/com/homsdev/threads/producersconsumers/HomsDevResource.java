package com.homsdev.threads.producersconsumers;

import java.util.LinkedList;

public class HomsDevResource {

	private LinkedList<String> resourceList = new LinkedList<>();

	public synchronized String consume() throws InterruptedException {
		while (resourceList.size() <= 0) {
			wait();
		}
		return resourceList.poll();
	}

	public synchronized void produce(String s) {
		resourceList.offer(s);
		notifyAll();
	}

}
