package ru.mirea.kvbo01.senkov;

public class Main {
    public static void main(String[] args) {
        MovablePoint t=new MovablePoint(10,10,50,50);
 MovableCircle a=new MovableCircle(10,t);
        System.out.println(a.getName()+"\n"+a);
    }
}
