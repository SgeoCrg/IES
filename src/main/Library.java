package main;

import data.Book;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Library {

    public static void main(String[] args) {
        Map<String, Book> library = new HashMap<>();
        Book b1 = new Book("0001", "Dragonlance Chronicles", "Margaret Weiss");
        Book b2 = new Book("0002", "Lord of the rings", "J.R.R.Tolkien");
        Book b3 = new Book("0003", "Harry Potter","J.A.Rowling");
        Book b4 = new Book("0004", "Penitent","Dan Abnett");
        library.put(b1.getId(), b1);
        library.put(b2.getId(), b2);
        library.put(b3.getId(), b3);
        library.put(b4.getId(), b4);

        show(library);
    }

    static void show(Map<String, Book> map) {
        for (String key : map.keySet())
        {
            System.out.println(map.get(key).toString());
        }
    }
}
