package com.baeldung.decorator;

public class Sight extends Kastov762 {

    public Sight(Kastov762 kas762) {
        super(kas762);
    }

    public String decorate() {
        return super.decorate() + decorateWithSight();

    }

    private String decorateWithSight() {
        return " With Red Dot Sight ";
    }

}