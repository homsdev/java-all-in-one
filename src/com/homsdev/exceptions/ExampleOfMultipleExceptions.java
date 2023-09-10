package com.homsdev.exceptions;

public class ExampleOfMultipleExceptions {

	public static int methodWithMultipleCheckedExceptions(int a, int b)
			throws ArithmeticException, IllegalArgumentException {
		if (b == 0)
			throw new ArithmeticException("cannot divide by 0");
		if (b >= 9)
			throw new IllegalArgumentException("b cannot be greater than 9");
		return a/b;
	}

	public static void main(String[] args) {
		System.out.println(methodWithMultipleCheckedExceptions(10, 10));

	}

}
