package com.example.bookstore.literatureModel;

public class Literature {
    private String title;
    private String author;
    private String genre;
    private double price;

    public Literature(String title, String author, String genre, double price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;   
    }
    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return this.author; }
    public void setAuthor(String author) { this.author = author; }
    public String getGenre() { return this.genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public double getPrice() { return this.price; }
    public void setPrice(double price) { this.price = price; }
}
