package com.homsdev.threads.smokersalgorithm;

import java.util.Random;

public class PaperProducer extends Thread {

	private CigaretteResource resource;

	public PaperProducer(CigaretteResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Cigarette cigarette = resource.getCigarette();
				cigarette.setPaper(Boolean.TRUE);
				resource.produce(cigarette);
				String ln = String.format("%s added paper", getName());
				System.out.println(ln);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
