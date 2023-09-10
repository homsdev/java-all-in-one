package com.homsdev.exceptions;

/**
 * Checked exceptions are required to be checked by the compilator
 */
public class ExampleOfCheckException {

	/**
	 * Throws a checked exception
	 * @param a
	 * @param b
	 * @return
	 * @throws Exception
	 */
	static int methodWithCheckedException(int a, int b) throws Exception{
		if(b!=0) return a/b;
		else throw new Exception("Cannot divide by 0");
	}
	
	/**
	 * Deal with exception with try/catch or propagate it
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(methodWithCheckedException(10, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
