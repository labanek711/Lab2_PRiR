package com.company;

public class Drukarka extends Thread{

    int numer;
    String nazwa;
    int kartkiDoWydruku;

    Kolor jakiKolor;
    Druk druk= Druk.DRUKOWANIE;

    public Drukarka (int numer,String nazwa, int kartkiDoWydruku,Kolor jakiKolor){
        this.numer=numer;
        this.nazwa=nazwa;
        this.kartkiDoWydruku=kartkiDoWydruku;
        this.jakiKolor=jakiKolor;
    }

    private void drukowanie() throws InterruptedException {
        int iter = 0;
        while (druk == Druk.DRUKOWANIE){
            Thread.sleep(997);

            System.out.println("Drukarka numer: "+numer +"("+nazwa+") "+", Do końca wydruku zostało " + kartkiDoWydruku + " kartek.");

            kartkiDoWydruku-=1;
            iter++;

            if(kartkiDoWydruku<=0){
                System.out.println("Koniec wydruku drukarki numer "+numer +"("+nazwa+") ");
                druk = Druk.KONIEC;
            }
        }
    }

    @Override
    public void run() {
        try {
            drukowanie();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

