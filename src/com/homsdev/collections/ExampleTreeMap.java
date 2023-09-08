package com.homsdev.collections;

import java.util.TreeMap;

/**
 * Order its keys based on natural order
 */
public class ExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<String,String> map = new TreeMap<>();

        map.put("Zi zu","Soccer player");
        map.put("Alex","Programmer");
        map.put("Juan","Happy person");

        System.out.println(map);
    }

}
