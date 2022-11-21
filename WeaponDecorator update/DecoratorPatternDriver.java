package com.baeldung.decorator;

import static com.baeldung.util.LoggerUtil.LOG;

public class DecoratorPatternDriver {  // creates new class called decorator pattern driver

    public static void main(String[] args) {   // public class main with string objects
        // new kastov762 object with one decorator element
        Kastov762 kas762_1 = new Suppressor(new Kastov762Impl());
        LOG.info(kas762_1.decorate());    // outputs with decorations

        // new kastov762 object with 6 decorator elements 
        Kastov762 kas762_2 = new Suppressor(new Sight(new Ammunition1(new Barrel(new Camo(new Kastov762Impl())))));
        LOG.info(Kastov762_2.decorate()); // outputs with decorations

    }

}