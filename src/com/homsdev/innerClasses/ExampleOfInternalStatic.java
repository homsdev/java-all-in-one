package com.homsdev.innerClasses;

class ExternalClass {

	public void foo() {
		System.out.println("foo");
	}

	static class InternalStaticClas {
		void bar() {
			System.out.println("bar");
		}
	}
}

public class ExampleOfInternalStatic {
	public static void main(String[] args) {
		ExternalClass.InternalStaticClas obj = new ExternalClass.InternalStaticClas();
		obj.bar();
		
	}
}
