package com.oussamadahir.patterns.composite;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("workspace");

        Folder docs = new Folder("documents")
                .add(new File("rapport.pdf", 240_000))
                .add(new File("notes.txt", 8_500));

        Folder code = new Folder("code")
                .add(new File("Main.java", 1_200))
                .add(new File("pom.xml", 850));

        Folder media = new Folder("media")
                .add(new File("logo.png", 75_000))
                .add(new Folder("photos")
                        .add(new File("img1.jpg", 1_800_000))
                        .add(new File("img2.jpg", 2_100_000))
                );

        root.add(docs).add(code).add(media).add(new File("README.md", 4_200));

        root.print("");
        System.out.println("\nTaille totale du workspace : " + root.size() + " bytes");
    }
}
