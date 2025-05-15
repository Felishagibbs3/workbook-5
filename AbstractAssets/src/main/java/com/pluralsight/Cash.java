package com.pluralsight;

//a subclass that has been created of Asset called Cash that stores money from under the mattress.
public class Cash extends Asset {
    private double amount;

    public Cash(String description, String dateAcquired, double amount) {
        super(description, dateAcquired, amount);
    }

// override getValue() to return amount.
    @Override
    public double getValue() {
        return amount;
    }


    //EXERCISE 2 directions
    // modify your Asset class to be an abstract class. Then make the getValue() method an abstract method.
    //Re-test application. Try to create an object of an Asset. What happens?

    //Create a new class that extends Asset, the Cash class. This represents the cash that you stash away under your mattresses.
    // The value of cash does not fluctuate, therefore there does not need to be any custom logic for the getValue() method.
    // What issues are you running into when you try to create the Cash class? What are your options to address these issues?
}
