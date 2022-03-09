package com.dio;

public class Book {

    public String title;
    public String author;
    public String publisher;
    public int year;
    public int pages;
    public int isbn;
    public double price;
    public String state;

    public Book(String title, String author, String publisher, int year, int pages, int isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.isbn = isbn;
        this.price = price;
    }
    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getPages(){
        return this.pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String Details(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPublisher: " + this.publisher + "\nYear: " + this.year + "\nPages: " + this.pages + "\nISBN: " + this.isbn + "\nPrice: " + this.price;
    }

    public String getState() {
        return state;
    }

    public void open() {
        this.state = "open";
    }

    public void close() {
        this.state = "closed";
    }

    public String Read(){
        if(this.state == "open"){
            return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        }
        else{
            return "You must open the book first!";
        }
    }
}