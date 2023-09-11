package com.homsdev.innerClasses;

interface Playable {
	void play();
}

public class ExampleOfAnonymousInterfaceClass {

	public static void main(String[] args) {
		Playable obj = new Playable() {
			@Override
			public void play() {
				System.out.println("Playing");
			}
		};

		obj.play();
	}
}
