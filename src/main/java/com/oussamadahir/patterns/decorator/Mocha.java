package com.oussamadahir.patterns.decorator;

public class Mocha extends Boisson {
    public Mocha() { description = "Cafe Mocha"; }
    @Override public double cout() { return 18.0; }
}
