package com.homsdev.collections;

import java.util.TreeSet;

/**
 * Implement comparable to set ordering rules for objects of current class
 */
class Dog implements Comparable<Dog>{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.name.compareTo(o.getName());//Asc
        //return o.getName().compareTo(name);//Desc
    }
}

public class ExampleComparable {
    public static void main(String[] args) {
        TreeSet<Dog> dogs = new TreeSet<>();
        dogs.add(new Dog("Rufo"));
        dogs.add(new Dog("Bobby"));
        dogs.add(new Dog("Laika"));
        System.out.println(dogs);
    }
}
