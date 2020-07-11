package com.memento;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("a");
        // Storing Editor State in History
        history.push(editor.createState());

        editor.setContent("b");
        // Storing Editor State in History
        history.push(editor.createState());

        editor.setContent("c");
        // Storing Editor State in History
        System.out.println(editor.getContent());

        // Undo
        editor.restore(history.pop());


        System.out.println(editor.getContent());

        // Undo
        editor.restore(history.pop());
        System.out.println(editor.getContent());

        //Undo
        editor.restore(history.pop());
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());

    }
}
