package com.homsdev.threads.smokersalgorithm;

import java.util.Random;

public class LighterProducer extends Thread {

	CigaretteResource resource;

	public LighterProducer(CigaretteResource resource, String name) {
		super(name);
		this.resource = resource;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Cigarette cigarette = resource.getCigarette();
				cigarette.setLighter(Boolean.TRUE);
				resource.produce(cigarette);
				String ln = String.format("%s added lighter", getName());
				System.out.println(ln);
				Thread.sleep(new Random().nextInt(300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
