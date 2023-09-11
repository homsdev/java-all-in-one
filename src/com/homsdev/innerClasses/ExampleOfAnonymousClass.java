package com.homsdev.innerClasses;

class DummyClass1 {
	void foo() {
		System.out.println("foo");
	}
}

/**
 * An anonymous class is a class without name that inherits from object instance class
 */
public class ExampleOfAnonymousClass {

	public static void main(String[] args) {
		System.out.println("Example of anonymous class");
		DummyClass1 obj = new DummyClass1() {
			@Override
			void foo() {
				System.out.println("bar");
			}
		};
		obj.foo();
	}
}
