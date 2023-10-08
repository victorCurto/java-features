package com.codingwithjohn;

public class GenericPrinter<T extends Animal> {

    public GenericPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    T thingToPrint;

    public void print(){
        thingToPrint.eat();
        System.out.println(thingToPrint);
    }
}
