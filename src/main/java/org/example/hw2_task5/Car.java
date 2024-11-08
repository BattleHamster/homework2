package org.example.hw2_task5;
/*Задача “Автомобиль”
Создайте класс Car с полями для марки, модели и года выпуска. Реализуйте методы для получения и установки этих полей
Создайте интерфейс Drivable с методами start(), stop() и drive(distance), которые реализуют класс Car
для имитации вождения автомобиля. */


public class Car implements Drivable{
    public String brand;
    public String model;
    public int year;

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive(int Distance) {

    }
}
