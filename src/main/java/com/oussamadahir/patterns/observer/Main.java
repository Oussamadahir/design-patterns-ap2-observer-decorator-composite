package com.oussamadahir.patterns.observer;

public class Main {
    public static void main(String[] args) {
        StockTicker ticker = new StockTicker();
        ticker.subscribe(new PriceLogger());
        ticker.subscribe(new AlertSubscriber("CFG", 120.0));
        ticker.subscribe(new MovingAverageSubscriber(3));

        double[] cfgPrices = {115.0, 117.5, 119.2, 121.8, 124.0};
        double[] atwPrices = {410.0, 408.5, 405.0, 411.7, 415.5};

        for (int i = 0; i < cfgPrices.length; i++) {
            System.out.println("--- tick " + (i + 1) + " ---");
            ticker.tick("CFG", cfgPrices[i]);
            ticker.tick("ATW", atwPrices[i]);
        }
    }
}
