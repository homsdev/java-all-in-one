package com.homsdev.threads.smokersalgorithm;

import java.util.Random;

public class SmokerConsumer extends Thread{

	CigaretteResource resource;

	public SmokerConsumer(CigaretteResource resource,String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Cigarette consume = resource.consume();
				String ln = String.format("%s is smoking %s", getName(),consume.toString());
				System.out.println(ln);
				Thread.sleep(new Random().nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
