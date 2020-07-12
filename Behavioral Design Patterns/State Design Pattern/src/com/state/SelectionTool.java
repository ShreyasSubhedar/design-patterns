package com.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");

    }

    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }
}
