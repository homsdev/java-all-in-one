package com.homsdev.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class Collections has a group of methods we can use to work with them
 */
public class ExampleCollections {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rocky");
        names.add("Zazz");
        names.add("Tera");
        names.add("Alba");
        Collections.sort(names);
        System.out.println(names);
    }
}
