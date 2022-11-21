package com.baeldung.decorator;

public abstract class Kastov762Decorator implements Kastov762 { // creates class called WeaponDecorator and implements the Kastov762 interface
    private Kastov762 kas762;

    public Kastov762Decorator(Kastov762 kas762) { // public method that takes in the input from the kastov762 interface
        this.kas762 = kas762; // assigns value of kas762 to kas762
    }
  // standard constructors for thhe kas762 object uses own implementation of a method
    @overide
    public String decorate() {
        return kas762.decorate();   // return kas762 with decorators to interface
    }
}