package com.homsdev.exceptions;

public class ExampleOfUnionCatchBlock {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10/a;
			System.out.println(b);
			String name = "Homs";
			System.out.println(name.toUpperCase());
		} catch (ArithmeticException | NullPointerException e) {
			System.err.printf("Aritmethic or NullPointer exception fired %s \n", e.getMessage());
		}
		finally {
			System.out.println("Always execute");
		}
	}
}
