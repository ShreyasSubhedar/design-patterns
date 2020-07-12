package com.state;

public class BrushTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Draw a Line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Icon");
    }
}
