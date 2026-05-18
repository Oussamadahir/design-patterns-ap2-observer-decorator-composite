package com.oussamadahir.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/** Subject: maintains its list of subscribers and notifies them on each tick. */
public class StockTicker {
    private final List<StockSubscriber> subscribers = new ArrayList<>();

    public void subscribe(StockSubscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(StockSubscriber s) {
        subscribers.remove(s);
    }

    public void tick(String symbol, double price) {
        for (StockSubscriber s : subscribers) {
            s.onPriceUpdate(symbol, price);
        }
    }
}
