package com.homsdev.collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Cat{
    private String name;
    private String gender;

    public Cat(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class OrderCatsByName implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class OrderCatsByGender implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}

/**
 * Imposes a total ordering on some collection of objects
 */
public class ExampleComparator {

    public static void main(String[] args) {
        Set<Cat> cats = new TreeSet<>(new OrderCatsByName());

        cats.add(new Cat("Bequer","M"));
        cats.add(new Cat("Ozzy","F"));
        cats.add(new Cat("Pili","F"));
        cats.add(new Cat("Zazz","M"));

        System.out.println(cats);
    }


}
