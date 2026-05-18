package com.oussamadahir.patterns.decorator;

public class Caramel extends DecorateurBoisson {
    public Caramel(Boisson boisson) { super(boisson); }
    @Override public double cout() { return 0.5 + boisson.cout(); }
    @Override public String getDescription() { return boisson.getDescription() + " + Caramel"; }
}
