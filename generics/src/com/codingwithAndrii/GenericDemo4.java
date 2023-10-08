package com.codingwithAndrii;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {

    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();

        //processParentElements(children); // compilation error

        processElements(children);

        Child child = children.get(0);
        child.childSpecificMethod();

        List<Parent> parents = new ArrayList<>();
        List<Child> children2 = new ArrayList<>();
        processElements2(parents);
        processElements2(children2);

        List<Grandchild> grandChildren = new ArrayList<>();
//		processElements2(grandChildren); // compilation error

        Child child2 = children.get(0);
        child.childSpecificMethod();
    }

    public static void processParentElements(List<Parent> parents) {
    }

    /*    ? super Child -> wildcard with upper bound => WE CAN'T ADD NEW ELEMENTS
     * Used when we wanted to use the method ony to read elements from the container to process data
     * use - upper boud wildcard
     * */
    public static void processElements(List<? extends Parent> elements) {
        Parent parent = elements.get(0);
//		Child child = elements.get(0); // compilation error
//
//		elements.add(new Parent()); // compilation error
//		elements.add(new Child()); // compilation error
//		elements.add(new Grandchild()); // compilation error
        elements.add(null);
    }

    /*    ? super Child -> wildcard with lower bound => WE CAN ADD NEW ELEMENTS
     * Used when we want to create a method that will work with collections, parametrized by different types, and
     * you want to use this method to modify the collection and to add elements use - lower bound at wildcard
     * */
    public static void processElements2(List<? super Child> elements) {
        Object element = elements.get(0);
//		Child parentElement = elements.get(0); // compilation error

        elements.add(new Child());
        elements.add(new Grandchild());
        elements.add(null);
//		elements.add(new Parent());
//		elements.add(new Object());
    }
}

class Parent {
}

class Child extends Parent {
    public void childSpecificMethod() {
    }
}

class Grandchild extends Child {
}
