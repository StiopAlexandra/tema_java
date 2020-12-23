package com.company;

public class Main {

    public static void main(String[] args) {

        Triunghi t1 = new Triunghi(4,8,"dreptunghic");
        Triunghi t2= new Triunghi(4,3,"isoscel");
        Dreptunghi d1= new Dreptunghi(6 ,4);
        Dreptunghi d2 = new Dreptunghi (2,2);
        System.out.println("\n"+"Informatiile despre t1:");
        t1.afiseazaTipul();
        t1.afiseazaDimensiunile();
        System.out.println("Aria este "+t1.calculeazaAria());
        System.out.println("\n"+"Informatiile despre t2:");
        t2.afiseazaTipul();
        t2.afiseazaDimensiunile();
        System.out.println("Aria este "+t2.calculeazaAria());
        System.out.println("\n"+"Informatiile despre d1:");
        d1.afiseazaDimensiunile();
        System.out.println("Aria este "+d1.calculeazaAria());
        if(d1.cazParticular()==true)
            System.out.println("!Caz particular! Acesta este un patrat");
        else
            System.out.println("Acesta este un dreptunghi");
        System.out.println("\n"+"Informatiile despre d2:");
        d2.afiseazaDimensiunile();
        System.out.println("Aria este "+d2.calculeazaAria());
        if(d2.cazParticular()==true)
            System.out.println("!Caz particular! Acesta este un patrat");
        else
            System.out.println("Acesta este un dreptunghi");

    }
}
