package com.oussamadahir.patterns.observer;

public class PriceLogger implements StockSubscriber {
    @Override
    public void onPriceUpdate(String symbol, double price) {
        System.out.printf("[Logger] %s = %.2f%n", symbol, price);
    }
}
