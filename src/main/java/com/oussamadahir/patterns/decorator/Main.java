package com.oussamadahir.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Boisson b = new Latte();
        printOrder(b);

        b = new Chocolat(new Latte());
        printOrder(b);

        b = new Caramel(new Chocolat(new Cappuccino()));
        printOrder(b);

        b = new Noisette(new Chocolat(new Chocolat(new Mocha())));
        printOrder(b);
    }

    private static void printOrder(Boisson b) {
        System.out.printf("%-40s | %.2f MAD%n", b.getDescription(), b.cout());
    }
}
