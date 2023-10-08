package com.codingwithjohn;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        IntegerPrinter printeri = new IntegerPrinter(23);
        printeri.print();
        DoublePrinter printerd = new DoublePrinter(2.3);
        printerd.print();*/

/*        GenericPrinter<Cat> printerg = new GenericPrinter(new Cat());
        printerg.print();
        GenericPrinter<Dog> printerg1 = new GenericPrinter(new Dog());
        printerg1.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        //cats.add(new Dog());

        Cat myCat = (Cat) cats.get(0);*/

//        shout("John", 57);

/*        List<Integer> inList = new ArrayList<>();
        inList.add(3);
        printList(inList);*/

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }


    //Generic method
    private static <T, V> T shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!");
        System.out.println(otherThingToShout + "!!!!");
        return thingToShout;
    }

    //whild card "?" - used in collections when we don't know the type of specific generic
    private static void printList(List<? extends Animal> myList) {
        System.out.println("List size: "+ myList.size());
    }
}
