package com.homsdev.exceptions;

class ResourceHomsdev implements AutoCloseable{
	
	public void foo() {
		System.out.println("Foo");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Freeing Resources");
	}
}


public class ExampleTryWithResources {

	public static void main(String[] args) {
		try(ResourceHomsdev resource= new ResourceHomsdev()) {
			resource.foo();
		} catch (Exception e) {
			
		}
	}
	
}
