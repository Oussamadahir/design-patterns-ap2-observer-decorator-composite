package com.oussamadahir.patterns.observer;

public interface StockSubscriber {
    void onPriceUpdate(String symbol, double price);
}
