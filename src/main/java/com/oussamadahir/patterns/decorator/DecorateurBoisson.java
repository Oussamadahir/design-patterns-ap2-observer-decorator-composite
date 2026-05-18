package com.oussamadahir.patterns.decorator;

public abstract class DecorateurBoisson extends Boisson {
    protected final Boisson boisson;

    protected DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public abstract String getDescription();
}
