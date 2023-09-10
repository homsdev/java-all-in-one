package com.homsdev.exceptions;

/**
 * Finally always execute only program.exit(0) can interrupt it 
 * Try is only mandatory statement
 * General exceptions always go in the end
 */
public class ExampleOfExceptionRules {

	static void test() {
		try {
			return;
		} finally {
			System.out.println("Always execute");
		}
	}

	public static void main(String[] args) {
		test();
		try {
			int a = 10;
			int b = 10 / a;
			System.out.println(b);
			String name = "Homs";
			System.out.println(name.toUpperCase());
		} catch (ArithmeticException | NullPointerException e) {
			System.err.printf("Aritmethic or NullPointer exception fired %s \n", e.getMessage());
		} finally {
			System.out.println("Always execute");
		}
	}
}
