package com.homsdev.collections;

class  BeanGeneric <T>{
    private T value;

    public BeanGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class ExampleOfGenerics {

    public static void main(String[] args) {
        BeanGeneric<String> bean = new BeanGeneric<>("Homs");
        System.out.println(bean.getValue());
        bean.setValue("Serah");
        System.out.println(bean.getValue());
    }

}
