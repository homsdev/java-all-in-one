package com.homsdev.exceptions;

/**
 * UncheckedException its not necessary to propagate them or handle them with try /catch
 */
public class ExampleOfThrow {

	static Double divide(Double a, Double b) {
		if (b != 0) {
			return a / b;
		} else {
			throw new IllegalArgumentException("You cant divide by zero");
		}
	}

	public static void main(String[] args) {
		Double result = divide(10d, 0d);
		System.out.println(result);
	}
}
