package com.codingwithjohn;

public class StringPrinter {

    public StringPrinter(String thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    String thingToPrint;

    public void print(){
        System.out.println(thingToPrint);
    }
}
