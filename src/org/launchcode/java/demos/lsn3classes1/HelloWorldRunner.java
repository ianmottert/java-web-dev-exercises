package org.launchcode.java.demos.lsn3classes1;

public class HelloWorldRunner {

    public static void main(String[] args) {

        HelloWorld goodbye = new HelloWorld("Goodbye World");
        System.out.println(goodbye.getMessage()); // prints "Goodbye World"

        // HelloWorld hello = new HelloWorld();
        // hello.sayHello();
    }
}
