package com.Strategy;

public class Main {

    public static void main(String[] args) {
        ImageStorage imageStorage =new ImageStorage(new JpegCompressor(),new BandWFilter());
        imageStorage.store();
    }
}
