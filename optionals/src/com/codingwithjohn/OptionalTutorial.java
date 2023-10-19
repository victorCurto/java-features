package com.codingwithjohn;

import java.util.Optional;

public class OptionalTutorial {

/*
* Optionals are really intended to only be used as a return type !!!
* where without optionals your method has the possibility of returning null.
*
* Note: it is certainly technically possible to have as optional as like a method parameter, optionals are just like any other objects
*       so technically you can create and use them wherever you want but the truth is that optionals were ony intended to be used as a return type
*       and that's to blatantly tell the user of that method that the value that they're looking for might not exist, so they have to deal with that situation
* */
    public static void main(String[] args) {
        //Without optionals
        /*
        Cat myCat = findCatByName("Fred");

        if (myCat != null) {
            System.out.println(myCat.age());
        } else {
            System.out.println(0);
        }
        */
        Optional<Cat> optionalCat = findCatByName("Fred");
        Cat myCat = optionalCat.orElse(new Cat("UNKNOWN", 0));

        Cat myCat2 = optionalCat.orElseGet( () -> new Cat("UNKNOWN", 0)  );

        System.out.println(myCat.age());
        System.out.println(myCat2.age());

        Optional<Integer> optionalAge = optionalCat.map( Cat::age);
        Integer age = optionalCat.map( Cat::age).orElse(0);

        System.out.println(optionalAge.orElse(0));
        System.out.println(age);

    }

    //Simulate a call to a DB
    /*
    private static Cat findCatByName(String name){
        Cat cat = new Cat(name, 3);
        return cat;
    }
    */

    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        return Optional.ofNullable(cat);
        //Optional.of(cat); -> if we know that the object is not null
        //Optional.ofNullable(cat); -> if we don't know if the object is null, if is null it will create an empty optional
        //Optional.empty(); -> Create an empty optional
    }

}


record Cat(String name, int age) {}
/*
class Cat {
    int age;
    String name;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/