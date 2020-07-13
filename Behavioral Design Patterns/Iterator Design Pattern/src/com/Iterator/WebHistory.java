package com.Iterator;

import java.util.ArrayList;
import java.util.List;

public class WebHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String website) {
        urls.add(website);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastWebUrl = urls.get(lastIndex);
        urls.remove(lastWebUrl);
        return lastWebUrl;
    }
    public  Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {
        private WebHistory history;
        private  int index;
        public ListIterator(WebHistory history) {

            this.history = history;
        }

        @Override
        public Boolean hasNext() {
            return (index<history.urls.size());
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }
    }


}
