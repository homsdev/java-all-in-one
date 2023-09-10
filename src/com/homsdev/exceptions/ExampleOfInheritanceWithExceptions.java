package com.homsdev.exceptions;

class ClassWithExceptions {
	public void foo() throws IllegalArgumentException {
		throw new IllegalArgumentException("Error at fathers method class");
	}
}

/**
 * Cannot change or add new exceptions in override methods but exceptions can be
 * extension of father class exceptions, you can ommit throw declaration in
 * override method
 */
class ChildClassWithExceptions extends ClassWithExceptions {

	@Override
	public void foo() {
		System.out.println("Child foo");
	}
}

public class ExampleOfInheritanceWithExceptions {

	public static void main(String[] args) {
		ChildClassWithExceptions c = new ChildClassWithExceptions();
		c.foo();
		ClassWithExceptions a = new ClassWithExceptions();
		a.foo();
	}

}
