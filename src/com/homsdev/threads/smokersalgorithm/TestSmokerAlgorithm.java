package com.homsdev.threads.smokersalgorithm;

public class TestSmokerAlgorithm {

	public static void main(String[] args) {

		CigaretteResource resource = new CigaretteResource();
		LighterProducer lighterProducer = new LighterProducer(resource, "Lighter Producer:");
		TobaccoProducer tobaccoProducer = new TobaccoProducer(resource, "Tobacco Producer");
		PaperProducer paperProducer = new PaperProducer(resource, "Paper Producer");
		SmokerConsumer smokerConsumer = new SmokerConsumer(resource, "Homs");
		SmokerConsumer saraConsumer = new SmokerConsumer(resource, "Sara");

		lighterProducer.start();
		tobaccoProducer.start();
		paperProducer.start();
		smokerConsumer.start();
		saraConsumer.start();

	}
}
