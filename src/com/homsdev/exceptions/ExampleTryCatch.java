package com.homsdev.exceptions;

public class ExampleTryCatch {
	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 10 / x;
			System.out.println("Division result: " + y);
			String name = "Omar";
			System.out.println(name.toUpperCase());
		} catch (ArithmeticException e) {
			System.err.printf("Aritmethic exception %s \n", e.getMessage());
		} catch (NullPointerException e) {
			System.err.printf("NullPointer exception %s \n", e.getMessage());
		} catch (Exception e) {
			System.err.printf("Generic exception %s \n", e.getMessage());
		} finally {
			System.out.println("Always execute");
		}
	}
}
