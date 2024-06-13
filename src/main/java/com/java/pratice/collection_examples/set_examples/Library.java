package com.java.pratice.collection_examples.set_examples;

import java.util.TreeSet;

public class Library {

    private TreeSet<String> bookTitles;

    public Library(){
        bookTitles = new TreeSet<>();
    }
    public Boolean addBook(String title){
        return bookTitles.add(title);
    }
    public Boolean removeBook(String title){
        return bookTitles.remove(title);
    }
    public Boolean hasBook(String title){
        return bookTitles.contains(title);
    }
    public void displayBooks(){
        System.out.println("Books in the library:" +bookTitles);
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Let us C");
        library.addBook("Software engineering");
        library.addBook("Object oriented programming");
        library.addBook("coding");
        library.addBook("abc");

        library.displayBooks();

        if(!library.addBook("Software engineering")){
            System.out.println("The book is already in the library");
        }
        if(!library.addBook("Java Black book")){
            System.out.println("The book is already in the library");
        }else{
            System.out.println("The book is successfully added to the library");
        }

        if(library.hasBook("coding")){
            System.out.println("The book is available in the library");
        }

        library.removeBook("abc");

        library.displayBooks();
    }
}
