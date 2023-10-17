package com.codingwithjohn;

import java.util.ArrayList;
import java.util.Arrays;

//Source: https://www.youtube.com/watch?v=NbYgm0r7u6o
public class ArrayAndArrayList {

    public static void main(String[] args) {
        // Arrays - can hold primitives or objects
        // [0][1][2][3]
        String[] friendsArray =  new String[4];
        String[] friendsArray2 =  {"John", "Chris", "Eric", "Luke"};
        System.out.println(friendsArray2[1]);
        System.out.println("Array size: "+friendsArray2.length);
        // You can't add more elements to this array

        //Set an element
        friendsArray2[0] = "Carl";
        System.out.println(friendsArray2[0]);
        System.out.println(friendsArray2);


        //ArrayList - can only hold objects, but support wrapper types for primitives
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        System.out.println(friendsArrayList2.get(1));
        System.out.println("ArrayList size: "+friendsArrayList2.size());
        friendsArrayList2.add("Mich");
        System.out.println(friendsArrayList2.get(4));
        System.out.println("ArrayList size: "+friendsArrayList2.size());
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));
        //Remove an element
        friendsArrayList2.remove("Chris");
        System.out.println(friendsArrayList2);
    }
}
