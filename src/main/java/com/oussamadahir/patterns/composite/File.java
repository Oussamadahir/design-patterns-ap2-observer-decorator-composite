package com.oussamadahir.patterns.composite;

/** Leaf. */
public class File implements FileSystemNode {
    private final String name;
    private final long sizeBytes;

    public File(String name, long sizeBytes) {
        this.name = name;
        this.sizeBytes = sizeBytes;
    }

    @Override public String getName() { return name; }
    @Override public long size() { return sizeBytes; }

    @Override
    public void print(String indent) {
        System.out.printf("%s- %s (%d bytes)%n", indent, name, sizeBytes);
    }
}
