package com.memento;

public class EditorState {
    private String content;

    public String getContent() {
        return content;
    }

    // Constructor
    public EditorState(String content) {
        this.content = content;
    }
}
