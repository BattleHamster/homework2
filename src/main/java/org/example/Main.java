package org.example;


import org.example.hw2_task1.Book;
import org.example.hw2_task2.Student;

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

        Student test_student = new Student();

        test_student.setName("Margo");
        test_student.setGrade(5.0);
        test_student.setIndex(98324);

        test_student.print();

    }

}