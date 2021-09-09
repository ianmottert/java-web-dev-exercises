package org.launchcode.java.demos.lsn3classes1;

public class HelloWorld {

    // public String message = "Hello World";
    // String message = "Hello World";
    private String message = "Hello World";

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }


    // public void sayHello() {

        // String message = "Goodbye World";

        // The line below prints "Goodbye World"
        // System.out.println(message);

        // The line below prints "Hello World"
        // System.out.println(this.message);
    // }

}
