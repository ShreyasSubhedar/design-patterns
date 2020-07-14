package com.Strategy;

public class PngCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Using PNG Compression Algorithm...");
    }
}
