package com.company;

import java.util.ArrayList;

public class User {
    int id = 0;
    String name;
    ArrayList<Book> borrowed = new ArrayList<Book>();

    public User(String name){
        this.id = ++this.id;
        this.name = name;
    }

    public ArrayList<Book> getBorrowed() {
        return borrowed;
    }

    public String getName() {
        return name;
    }

    public void addBorrowed(Book book) {
        this.borrowed.add(book);
        System.out.println("Name : "+name+" has borrow a book id."+book.getId());
    }

    public void returnBorrowed(Book book) {
        book.setOwn(null);
        this.borrowed.remove(book);
    }
}
