package com.company;

public class Book {
    int id;
    String bookName, type, own;
    public static int totalBookCreated = 0;

    public Book(String bookName, String type){
        totalBookCreated++;
        this.id = totalBookCreated;
        this.bookName = bookName;
        this.type = type;
        this.own = null;
    }

    public Book clone(){
        return new Book(this.bookName, this.type);
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getType() {
        return type;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }


    @Override
    public String toString() {
        return "Book {" + "id=" + id + ", bookName=" + bookName + '}';
    }


}
