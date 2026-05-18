package com.oussamadahir.patterns.decorator;

public class Cappuccino extends Boisson {
    public Cappuccino() { description = "Cafe Cappuccino"; }
    @Override public double cout() { return 16.0; }
}
