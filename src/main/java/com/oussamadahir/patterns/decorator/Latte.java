package com.oussamadahir.patterns.decorator;

public class Latte extends Boisson {
    public Latte() { description = "Cafe Latte"; }
    @Override public double cout() { return 14.0; }
}
