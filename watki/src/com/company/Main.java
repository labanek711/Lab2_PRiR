package com.company;

public class Main {

    public static void main(String[] args) {
        double poczatek = 1.5;
        double koniec = 2.8;
        double liczbaPrzedzialow = 16;

        M_prostokatow metodaProstokatow = new M_prostokatow(poczatek,koniec,liczbaPrzedzialow);
        M_trapezow metodaTrapezow = new M_trapezow(poczatek,koniec,liczbaPrzedzialow);
        M_Simpsona metodaSimpsona = new M_Simpsona(poczatek,koniec,liczbaPrzedzialow);

        metodaProstokatow.start();
        metodaTrapezow.start();
        metodaSimpsona.start();

        double sumaTrzech =metodaProstokatow.dzialanie()+metodaTrapezow.dzialanie()+metodaSimpsona.dzialanie();
        System.out.println(
                "Zsumowany wynik 3 metod: "+sumaTrzech
        );
    }
}
