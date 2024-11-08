package org.example;


import org.example.hw2_task1.Book;

public class Main {
    public static void main(String[] args) {

        Book test_book = new Book();

        test_book.setAuthor("Pupushkin");
        test_book.setName("Lulukomor'e");
        test_book.setYear(2552);

        String author = test_book.getAuthor();
        String name = test_book.getName();
        int year = test_book.getPublish_year();

        /*System.out.println(author);
        System.out.println(name);
        System.out.println(year);*/

        test_book.display();

    }

}