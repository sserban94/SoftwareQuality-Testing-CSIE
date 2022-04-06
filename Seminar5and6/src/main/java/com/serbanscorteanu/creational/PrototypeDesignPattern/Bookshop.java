package com.serbanscorteanu.creational.PrototypeDesignPattern;

import java.util.List;

public class Bookshop implements Cloneable {
    private String name;
    private List<Book> books;

    public Bookshop() {

    }

    @Override
    public String toString() {
        return "Bookshop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Bookshop(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public static Bookshop loadDataFromDb(String name) {
        Bookshop b = new Bookshop();
        b.setName(name);

        Book book;

        for (int i = 0; i < 10; i++){
            book = new Book("me", "Book no" + i, i*100);
        }

        return b;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        Bookshop bookshop = new Bookshop();
        bookshop.name = this.name;
        bookshop.books = List.copyOf(this.books);
        return bookshop;
    }
}

















