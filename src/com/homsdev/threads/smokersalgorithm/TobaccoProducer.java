package com.homsdev.threads.smokersalgorithm;

import java.util.Random;

public class TobaccoProducer extends Thread {

	CigaretteResource resource;

	public TobaccoProducer(CigaretteResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Cigarette cigarette = resource.getCigarette();
				cigarette.setTobacco(Boolean.TRUE);
				resource.produce(cigarette);
				String ln = String.format("%s added tobacco", getName());
				System.out.println(ln);
				Thread.sleep(new Random().nextInt(400));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
