package com.oussamadahir.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/** Composite: holds children that can be Files or other Folders. */
public class Folder implements FileSystemNode {
    private final String name;
    private final List<FileSystemNode> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public Folder add(FileSystemNode node) {
        children.add(node);
        return this;
    }

    @Override public String getName() { return name; }

    /** Recursively sums children sizes. */
    @Override
    public long size() {
        long total = 0;
        for (FileSystemNode c : children) {
            total += c.size();
        }
        return total;
    }

    @Override
    public void print(String indent) {
        System.out.printf("%s+ %s/  (total %d bytes, %d items)%n",
                indent, name, size(), children.size());
        for (FileSystemNode c : children) {
            c.print(indent + "  ");
        }
    }
}
