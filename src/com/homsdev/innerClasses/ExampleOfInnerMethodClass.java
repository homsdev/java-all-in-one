package com.homsdev.innerClasses;

public class ExampleOfInnerMethodClass {

	public static void foo() {

		class InternalMethodClass {
			void bar() {
				System.out.println("bar");
			}
		}

		InternalMethodClass obj = new InternalMethodClass();
		System.out.println("foo");
		obj.bar();
	}

	public static void main(String[] args) {
		System.out.println("Example of internal method class");
		foo();
	}

}
