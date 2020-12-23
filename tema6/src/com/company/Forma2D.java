package com.company;

public abstract class Forma2D {
    public Integer inaltime;
    public Integer latime;

    public Forma2D(Integer inaltime, Integer latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    public void afiseazaDimensiunile()
    {
        System.out.println("Inatimea este "+inaltime+"\n"+"Latimea este "+latime);
    }

    public abstract Integer calculeazaAria();
}
