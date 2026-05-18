package com.oussamadahir.patterns.observer;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/** Computes a simple moving average per symbol over the last N ticks. */
public class MovingAverageSubscriber implements StockSubscriber {
    private final int window;
    private final Map<String, Deque<Double>> history = new HashMap<>();

    public MovingAverageSubscriber(int window) {
        this.window = window;
    }

    @Override
    public void onPriceUpdate(String symbol, double price) {
        Deque<Double> buf = history.computeIfAbsent(symbol, k -> new ArrayDeque<>());
        buf.addLast(price);
        if (buf.size() > window) buf.removeFirst();
        if (buf.size() == window) {
            double avg = buf.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            System.out.printf("[MA%d] %s = %.2f%n", window, symbol, avg);
        }
    }
}
