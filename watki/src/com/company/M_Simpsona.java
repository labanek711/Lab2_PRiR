package com.company;

public class M_Simpsona extends Thread{

    private double poczatek;
    private double koniec;
    private double liczbaPrzedzialow;

    public M_Simpsona(double poczatek,double koniec, double liczbaPrzedzialow){
        this.poczatek=poczatek;
        this.koniec=koniec;
        this.liczbaPrzedzialow=liczbaPrzedzialow;
    }
    private double funkcja(double x) {
        return Math.cos(x * x + 0.5) / (1.1 + Math.sin(0.7 * x + 0.4));
    }

    public double dzialanie() {
        double suma = 0;
        double x;
        double sumat = 0;
        double h = (koniec - poczatek) / liczbaPrzedzialow;
        for (int i = 1; i < liczbaPrzedzialow + 1; i++) {
            x = poczatek + i * h;
            sumat += funkcja(x - h / 2);
            if (i < liczbaPrzedzialow)
                suma += funkcja(x);
        }
        return h / 6 * (funkcja(poczatek) + funkcja(koniec) + 2 * suma + 4 * sumat);
    }

    @Override
    public void run() {
        System.out.println("wynik metody Simpsona: " + dzialanie());
    }
}
