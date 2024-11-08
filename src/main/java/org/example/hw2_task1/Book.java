package org.example.hw2_task1;

/*
Задача “Книга”
Создайте класс Book с полями для хранения названия, автора и гола издания.
Реализуйте методы для получения и установки этих полей. Создайте интерфейс Displayable с методом display(),
который реализуется в классе Book для отображения информации о книге.
*/

public class Book implements Displayable {
    private String name;
    private String author;
    private int publish_year;

    public void setName (String name) {
        this.name = name;

    }

    public void setAuthor (String author) {
        this.author = author;

    }

    public void setYear (int year) {
        this.publish_year = year;

    }

    public int getPublish_year() {
        return this.publish_year;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }


    @Override
    public void display() {
        System.out.println(this.author);
        System.out.println(this.name);
        System.out.println(this.publish_year);
    }
}
