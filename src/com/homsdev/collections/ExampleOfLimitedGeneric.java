package com.homsdev.collections;

class Transport {}
class Car extends Transport{}

class Sportive extends Transport{}
class BeanGenericTransport<T extends Transport> {
}

/**
 * Extend a class into the Generic type <T> to only work with "IS A" subclasses
 */
public class ExampleOfLimitedGeneric {
    public static void main(String[] args) {
        //BeanGenericTransport<String> bean= new BeanGenericTransport<>();
        @SuppressWarnings("unused")
		BeanGenericTransport<Car> bean1= new BeanGenericTransport<>();
        @SuppressWarnings("unused")
		BeanGenericTransport<Transport> bean2= new BeanGenericTransport<>();
        @SuppressWarnings("unused")
		BeanGenericTransport<Sportive> bean3= new BeanGenericTransport<>();
    }

}
