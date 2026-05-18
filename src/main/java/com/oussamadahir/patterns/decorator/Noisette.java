package com.oussamadahir.patterns.decorator;

public class Noisette extends DecorateurBoisson {
    public Noisette(Boisson boisson) { super(boisson); }
    @Override public double cout() { return 0.25 + boisson.cout(); }
    @Override public String getDescription() { return boisson.getDescription() + " + Noisette"; }
}
