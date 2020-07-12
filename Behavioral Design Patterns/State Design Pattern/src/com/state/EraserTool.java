package com.state;

public class EraserTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Erase a line");
    }

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }
}
