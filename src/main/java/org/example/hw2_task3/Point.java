package org.example.hw2_task3;

/* Задача “Точка на плоскости”
Создайте класс Point с приватными полями x и y для координат точки на плоскости.
реализуйте методы для получения (get) и установки (set) этих полей. Создайте интерфейс Movable с методами moveUp(),
moveDown(), moveLeft() и moveRight() для изменения положения точки. */

public class Point implements Movable{

    private int x;
    private int y;

    public void setX (int x) {
        this.x = x;

    }

    public void setY (int y) {
        this.y = y;

    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public void moveUp() {
        this.y = y+1;
    }

    @Override
    public void moveDown() {
        this.y = y-1;
    }

    @Override
    public void moveLeft() {
        this.x = x-1;
    }

    @Override
    public void moveRight() {
        this.x = x+1;
    }
}
