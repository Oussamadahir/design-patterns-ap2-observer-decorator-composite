package com.oussamadahir.patterns.decorator;

public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) { super(boisson); }
    @Override public double cout() { return 0.75 + boisson.cout(); }
    @Override public String getDescription() { return boisson.getDescription() + " + Chocolat"; }
}
