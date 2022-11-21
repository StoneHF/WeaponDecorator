package com.baeldung.decorator;

public class Camo extends Kastov762 {   // creates new decorating element that extends from the abstract kastov762 class

    public Camo(Kastov762 kas762) {      // creates a new public camo using the kastov762 class
        super(kas762);                  //   calls the constructors parent method
    }

    public String decorate() {
        return super.decorate() + decorateWithCamo();    // modify the decorate method with a new decorating method according to user requirement

    }

    private String decorateWithCamo() {     // Creates a private method with a string datatype
        return " With Diamond Camo ";   // displays wih diamond camo onto the interface
    }

}