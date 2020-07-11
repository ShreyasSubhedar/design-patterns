package com.memento;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class History {
    // List to manage the Editor States
    private Stack<EditorState> states = new Stack<>();

    // Pushing Editor state
    public void push(EditorState state) {
        states.push(state);
    }

    // Popping Editor state
    public EditorState pop() {
        try {
            EditorState lastState = states.pop();
            return lastState;
        }
        catch (EmptyStackException e){
            System.out.println("Stack empty");
        }
        return null;

    }
}
