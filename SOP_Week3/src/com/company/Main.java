package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //        Create Nescessary
        Store instance = Store.getInstance();
        Store store = instance;
        User alex = new User("Alex");
        User pim = new User("Pim");
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = store.getBooks();

//        Welcome Page (Alex)
        System.out.println("Welcome to our Book Rental Shop!");
        System.out.println("Hi, Alex");
        System.out.println("====================================");
        System.out.println("Book list: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ". " + books.get(i));
        }
        System.out.println("====================================");
        System.out.println("Select a book : 3");
        pressAnyKeyToContinue();

//               Alex Borrow
        Book selectBook = store.getSelectBooks(2); // input - 1
        selectBook.setOwn("Alex");
        alex.addBorrowed(selectBook);
        store.borrowBook(selectBook);
        System.out.println(store.getBooks()); // Book id.3 is gone.
        pressAnyKeyToContinue();
        clearScreen();
        books = store.getBooks();

//        Welcome Page (Pim)
        System.out.println("Welcome to our Book Rental Shop!");
        System.out.println("Hi, Pim");
        System.out.println("====================================");
        System.out.println("Book list: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + 1 + ". " + books.get(i));
        }
        System.out.println("====================================");
        System.out.println("Select a book : 3");
        pressAnyKeyToContinue();

//               Pim Borrow
        selectBook = store.getSelectBooks(2); // input - 1
        selectBook.setOwn("Pim");
        pim.addBorrowed(selectBook);
        store.borrowBook(selectBook);
        System.out.println(store.getBooks()); // Book id.3 is gone.
        pressAnyKeyToContinue();
        clearScreen();
        books = store.getBooks();

//        Alex Return
        System.out.println("Welcome to our Book Rental Shop!");
        System.out.println("Hi, Alex");
        System.out.println("====================================");
        System.out.println("Borrowed book list: ");
        ArrayList<Book> borrowed = alex.getBorrowed();
        for (int i = 0; i < borrowed.size(); i++) {
            System.out.println(i + 1 + ". " + borrowed.get(i));
        }
        System.out.println("====================================");
        System.out.println("Enter return book : 1");
        Book returned = borrowed.get(0); // Input - 1
        alex.returnBorrowed(returned);
        store.returnBook(returned);

        System.out.println("Currently book in store : ");
        System.out.println(store.getBooks());
        System.out.println("Currently book with Alex : ");
        System.out.println(alex.getBorrowed());
        System.out.println("Currently book with Pim : ");
        System.out.println(pim.getBorrowed());
    }

    public static void pressAnyKeyToContinue() {
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static void clearScreen() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
        for (int i = 0; i < 6; ++i) {
            System.out.println();
        }
    }
    }
