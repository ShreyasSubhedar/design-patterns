package com.memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }
    // create editor state object
    public EditorState createState() {
        return new EditorState(content);
    }

    // Restore the editor state with the given state
    public void restore(EditorState state) {
        try {
            content = state.getContent();
        }
        catch (NullPointerException e){
            content="";
        }

    }

    public void setContent(String content) {
        this.content = content;
    }


}
