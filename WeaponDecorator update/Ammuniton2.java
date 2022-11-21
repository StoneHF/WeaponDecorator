package com.baeldung.decorator;

public class Ammunition2 extends Kastov762 {

    public Ammunition2(Kastov762 kas762) {
        super(kas762);
    }

    public String decorate() {
        return super.decorate() + decorateWithAmmunition2();

    }

    private String decorateWithAmmunition2() {
        return " With Armour Piercing Rounds ";
    }

}