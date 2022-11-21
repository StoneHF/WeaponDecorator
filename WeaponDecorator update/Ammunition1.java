package com.baeldung.decorator;

public class Ammunition1 extends Kastov762 {

    public Ammunition1(Kastov762 kas762) {
        super(kas762);
    }

    public String decorate() {
        return super.decorate() + decorateWithAmmunition1();

    }

    private String decorateWithAmmunition1() {
        return " With Incendiary Rounds ";
    }

}