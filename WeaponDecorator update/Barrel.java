package com.baeldung.decorator;

public class Barrel extends Kastov762 {

    public Barrel(Kastov762 kas762) {
        super(kas762);
    }

    public String decorate() {
        return super.decorate() + decorateWithBarrel();

    }

    private String decorateWithBarrel() {
        return " With Extended Barrel ";
    }

}