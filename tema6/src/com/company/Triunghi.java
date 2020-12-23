package com.company;

public class Triunghi extends Forma2D{
    String tip_triunghi;

    public Triunghi(Integer inaltime, Integer latime, String tip_triunghi) {
        super(inaltime, latime);
        this.tip_triunghi = tip_triunghi;
    }

    @Override
    public Integer calculeazaAria() {
        return inaltime*latime/2;
    }

    public void afiseazaTipul(){
        System.out.println("Triunghiul este " +tip_triunghi);
    }
}
