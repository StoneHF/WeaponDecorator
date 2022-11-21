package com.baeldung.decorator;

public class Suppressor extends Kastov762 {

    public Suppressor(Kastov762 kas762) {
        super(kas762);
    }

    public String decorate() {
        return super.decorate() + decorateWithSuppressor();

    }

    private String decorateWithSuppressor() {
        return " With Monolithic Suppressor ";
    }

}