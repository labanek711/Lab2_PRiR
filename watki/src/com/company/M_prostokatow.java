package com.company;

public class M_prostokatow extends Thread{

    private double poczatek;
    private double koniec;
    private double liczbaPrzedzialow;

    public M_prostokatow(double poczatek,double koniec, double liczbaPrzedzialow){
        this.poczatek=poczatek;
        this.koniec=koniec;
        this.liczbaPrzedzialow=liczbaPrzedzialow;
    }

    private double funkcja(double x) {
        return Math.cos(x * x + 0.5) / (1.1 + Math.sin(0.7 * x + 0.4));
    }

    public double dzialanie(){
        double n = liczbaPrzedzialow;
        double dx = (koniec - poczatek) / liczbaPrzedzialow;
        double y = 0;
        for (int i=1; i<=n; i++) {
            y += funkcja(poczatek + i * dx);
        }
        double wynik = y * dx;
        return wynik;
    }

    @Override
    public void run() {
        System.out.println("wynik metody prostokatow: " + dzialanie());
    }
}