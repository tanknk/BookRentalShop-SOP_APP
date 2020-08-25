package com.company;

import java.util.ArrayList;

public class Store {
    private static Store instance = null;
    private ArrayList<Book> books = new ArrayList<Book>();
    public final int maxBook = 60;
    //    Book Prototype
    Book math = new Book("Math", "m");
    Book sci = new Book("Science", "s");

    private Store() {
        this.books.add(math);
        this.books.add(sci);
//        Clone Book
        this.books.add(math.clone());
        for (int i = 0; i < 2; i++) {
            this.books.add(sci.clone());
        }
    }

    public static Store getInstance() {
        if (instance == null) {
            instance = new Store();
        }
        return instance;
    }


    public Book getSelectBooks(int id) {
        return books.get(id);
    }

    public ArrayList<Book> getBooks() {
        ArrayList<Book> selectBooks = new ArrayList<Book>();
        for (Book book : books) {
            selectBooks.add(book);
        }
        return selectBooks;
    }

    public void borrowBook(Book book) {
        this.books.remove(book);
    }

    public void returnBook(Book book) {
        this.books.add(book);
    }
}
