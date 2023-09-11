package com.homsdev.innerClasses;

abstract class DummyAbstracClass1 {
	abstract void foo();
}

public class ExampleOfAnonymousWithAbstractClass {

	public static void main(String[] args) {
		System.out.println("Example of anonymous abstract class");
		DummyAbstracClass1 obj = new DummyAbstracClass1() {
			@Override
			void foo() {
				System.out.println("foo");
			}
		};
		obj.foo();
	}

}
