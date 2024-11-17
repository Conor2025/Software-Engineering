package com.example.randomquotedisplay.quoteDisplayModel;

public class Quote {
    private String text;
    private String author;

    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }
    public String getText() { return this.text; }
    public void setText(String text) { this.text = text; }
    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }

}
