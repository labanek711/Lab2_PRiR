package com.company;

public class Main {

    public static void main(String[] args) {
        var drukarka = new Drukarka(1,"Canon", 7, Kolor.kolorowy);
        drukarka.start();
        var drukarka2 = new Drukarka(2,"Del", 10, Kolor.czarnoBialy);
        drukarka2.start();
    }
}