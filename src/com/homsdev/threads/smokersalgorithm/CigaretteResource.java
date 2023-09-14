package com.homsdev.threads.smokersalgorithm;

public class CigaretteResource {

	Cigarette cigarette;

	public CigaretteResource() {
		this.cigarette = new Cigarette();
	}

	public Cigarette getCigarette() {
		return cigarette;
	}

	public void setCigarette(Cigarette cigarette) {
		this.cigarette = cigarette;
	}

	public synchronized Cigarette consume() throws InterruptedException {
		while (!cigarette.isReady()) {
			wait();
		}

		Cigarette temp = new Cigarette();
		temp.setLighter(cigarette.getLighter());
		temp.setPaper(cigarette.getPaper());
		temp.setTobacco(cigarette.getTobacco());
		cigarette.reset();
		return temp;
	}

	public synchronized void produce(Cigarette cigarette) {
		this.cigarette = cigarette;
		notifyAll();
	}
}
