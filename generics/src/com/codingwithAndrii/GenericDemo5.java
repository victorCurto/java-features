package com.codingwithAndrii;

import java.util.ArrayList;
import java.util.List;

/* The Generic exist only for our compiler - there are no generics during the runtime because of the type erasure type
* Type erasure can be explained as a process of enforcing type constraints only at compile time and discarding the element type information at runtime
* */
public class GenericDemo5 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        List list = new ArrayList();
        list = integers;
        list.add("some string");

        Integer integer = integers.get(0);
        System.out.println(integer);

    }
}