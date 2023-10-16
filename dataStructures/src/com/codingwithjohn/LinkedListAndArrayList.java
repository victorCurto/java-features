package com.codingwithjohn;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAndArrayList {

    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList();
        namesLinkedList.add("John");
        namesLinkedList.add("Paul");
        namesLinkedList.add("George");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2)); // very slow comparing with the arrayList, because I need to go over every node/element
        namesLinkedList.add(1, "Vitor"); //add or remove elements very fast - constant time

    /*
    Behind the scenes ArrayList implements on top of an array with a default size and does all the work of resize an array and add more capacity
    Dynamic resize can take a quite a bit of time and resources
        String[] names = new String[10];
    */
        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("John");
        namesArrayList.add("Paul");
        namesArrayList.add("George");
        namesArrayList.add("Ringo");
        System.out.println(namesLinkedList.get(2)); // supper fast random access - constant time
        namesArrayList.add(1, "Vitor"); // very slow, needs to create a new "array" and copy/remove the new element
    }
}
