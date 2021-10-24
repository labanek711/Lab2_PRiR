package com.company;

public class M_trapezow extends Thread{

    private double poczatek;
    private double koniec;
    private double liczbaPrzedzialow;

    public M_trapezow(double poczatek,double koniec, double liczbaPrzedzialow){
        this.poczatek=poczatek;
        this.koniec=koniec;
        this.liczbaPrzedzialow=liczbaPrzedzialow;
    }

    private double funkcja(double x) {
        return Math.cos(x * x + 0.5) / (1.1 + Math.sin(0.7 * x + 0.4));
    }

    public double dzialanie(){
        double dx = (koniec - poczatek) / liczbaPrzedzialow;
        double sum = 0;
        double xi;
        for(int i=0; i<liczbaPrzedzialow;i++){
            xi= poczatek + (i/liczbaPrzedzialow) * (koniec - poczatek);
            sum += funkcja(xi);
        }
        return dx * (funkcja(poczatek)/2 + sum + funkcja(koniec)/2);
    }

    @Override
    public void run() {
        System.out.println("wynik metody trapezow: " + dzialanie());
    }
}