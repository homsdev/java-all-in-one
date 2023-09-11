package com.homsdev.innerClasses;

class External {

	void foo() {
		System.out.println("foo");
	}

	class Internal {
		void bar() {
			System.out.println("bar");
		}
	}
}

public class ExampleOfRegularInternalClasses {

	public static void main(String[] args) {
		External exObj = new External();
		External.Internal inObj = exObj.new Internal();
		exObj.foo();
		inObj.bar();
	}
}
