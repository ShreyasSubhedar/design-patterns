package com.Iterator;

public class Main {

    public static void main(String[] args) {
        WebHistory history = new WebHistory();
        history.push("github.com");
        history.push("facebook.com");
        history.push("gmail.com");
        Iterator<String> stringIterator = history.createIterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.current());
            stringIterator.next();
        }


        // If I want to iterate from the web history list then I need to add the getter to its class
    }
}
