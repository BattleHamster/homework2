package org.example.hw2_task2;

/*
Задача “Студент”
Создайте класс Student с полями для хранения имени, номера зачетной книжки и среднего балла.
Реализуйте методы для получения и установки этих полей. Создайте интерфейс Printable с методом print(),
 аналогично задаче “Банковский счёт”, для вывода информации о студенте. */



public class Student implements Printable{

    private String name;
    private int index;
    private double grade;

    public void setName (String name) {
        this.name = name;

    }

    public void setIndex (int index) {
        this.index = index;

    }

    public void setGrade (double grade) {
        this.grade = grade;

    }

    public String getName() {
        return this.name;
    }

    public int getIndex() {
        return this.index;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public void print() {
        System.out.println("Student's name: " + this.name);
        System.out.println("Stundet's index nr: " + this.index);
        System.out.println("Student's grade: " + this.grade);
    }
}
