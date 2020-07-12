package com.state;


public class Main {

    public static void main(String[] args) {

        // write your code here
        // Creating a Canvas object
        Canvas canvas = new Canvas();
        // Set current tool to SelectionTool
        canvas.setCurrentTool(new SelectionTool());
        // When mouse key is pressed this method gets called
        canvas.mouseDown();
        // When mouse key is released this method gets called
        canvas.mouseUp();
        // Set current tool to EraserTool
        canvas.setCurrentTool(new EraserTool());
        // When mouse key is pressed this method gets called
        canvas.mouseDown();
        // When mouse key is released this method gets called
        canvas.mouseUp();
        // Set current tool to BrushTool
        canvas.setCurrentTool(new BrushTool());
        // When mouse key is pressed this method gets called
        canvas.mouseDown();
        // When mouse key is released this method gets called
        canvas.mouseUp();
    }
}
