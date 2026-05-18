package com.oussamadahir.patterns.composite;

/** Component: common interface for leaves (File) and composites (Folder). */
public interface FileSystemNode {
    String getName();
    long size();          // bytes
    void print(String indent);
}
