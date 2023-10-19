package com.codingwithjohn;

import java.util.HashMap;

//Source: https://www.youtube.com/watch?v=H62Jfv1DJlU
public class MapAndHashMap {
    /*
    * A Map is just a collection of key value pairs it's like a lookup table
    * */
    public static void main(String[] args) {
        /*
        * Maps
        * -> don't guaranty the order
        * */

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 857636214);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsValue(56));
        empIds.put("John", 98765); //Override or add if not exists
        System.out.println(empIds);
        empIds.replace("John", 9999); //Override
        System.out.println(empIds);

        empIds.putIfAbsent("Steve", 90000); //Add if not exist
        System.out.println(empIds);
        empIds.remove("Steve");
        System.out.println(empIds);
    }
}
