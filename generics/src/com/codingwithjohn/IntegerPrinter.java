package com.codingwithjohn;

public class IntegerPrinter {

    public IntegerPrinter(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    Integer thingToPrint;

    public void print(){
        System.out.println(thingToPrint);
    }
}
