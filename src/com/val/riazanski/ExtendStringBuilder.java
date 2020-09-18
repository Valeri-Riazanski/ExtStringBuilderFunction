package com.val.riazanski;

import java.util.Stack;

public class ExtendStringBuilder {
    //fields
    private final StringBuilder stringBuilder;
    private final Stack<Runnable> history = new Stack<>();
    //constructors
    public ExtendStringBuilder(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
    //methods
    public void delete(int start, int end) {
        String deleted = stringBuilder.substring(start, end);
        this.stringBuilder.delete(start, end);
        this.history.push(() -> stringBuilder.insert(start, deleted));
    }
    public void append(String str) {
        stringBuilder.append(str);
        this.history.push(() -> {
            int end = stringBuilder.length();
            int start = end - str.length();
            stringBuilder.delete(start, end);
        });
    }
    public void reverse() {
        this.stringBuilder.reverse();
        history.push(() -> stringBuilder.reverse());
    }
    public void insert(int start, String str) {
        this.stringBuilder.insert(start, str);
        this.history.push(() -> stringBuilder.delete(start, start + str.length()));
    }
    public void replace(int start, int end, String str) {
        String replaced = stringBuilder.substring(start, end);
        this.stringBuilder.replace(start, end, str);
        history.push(() -> {
            if ((str != null) && (start != 0) && (end != 0)) {
                stringBuilder.replace(start, start + str.length(), replaced);
            }
        }
        );
    }
    public void unDo() {
        this.history.pop().run();
    }
    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }
}
