package com.homsdev.collections;

import java.util.Arrays;
import java.util.List;

public class ExampleOfWildcard {

	public <T extends Number> double sumOfTwoNumbers(T n1, T n2) {
		return n1.doubleValue() + n2.doubleValue();
	}

	static double sumOfValues(List<? extends Number> valList) {
		double sum = 0;
		for (Number number : valList) {
			sum += number.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		ExampleOfWildcard obj = new ExampleOfWildcard();
		Integer a = 1;
		Double b = 2.55;
		System.out.println("Adition of two different Number types");
		System.out.println(obj.sumOfTwoNumbers(a, b));
		
		System.out.println("Adition of inner values of list");
		System.out.println(sumOfValues(Arrays.asList(a,b,2f,1L)));
		
	}

}
