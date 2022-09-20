package ru.mirea.kvbo01.senkov;

public class MovablePoint implements Movable,Nameable {
     int x;
     int y;
     int ySpeed;
     int xSpeed;

    public MovablePoint(int x, int y, int ySpeed, int xSpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", ySpeed=" + ySpeed +
                ", xSpeed=" + xSpeed +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String getName() {
        return "Its a Point";
    }
}
