package com.oussamadahir.patterns.observer;

/** Triggers an alert when the price crosses a threshold. */
public class AlertSubscriber implements StockSubscriber {
    private final String watchSymbol;
    private final double threshold;

    public AlertSubscriber(String watchSymbol, double threshold) {
        this.watchSymbol = watchSymbol;
        this.threshold = threshold;
    }

    @Override
    public void onPriceUpdate(String symbol, double price) {
        if (symbol.equals(watchSymbol) && price >= threshold) {
            System.out.printf("[ALERT] %s a depasse %.2f (actuel: %.2f)%n",
                    symbol, threshold, price);
        }
    }
}
