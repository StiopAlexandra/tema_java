package com.company;

public class Dreptunghi extends Forma2D{
    public Dreptunghi(Integer inaltime, Integer latime) {
        super(inaltime, latime);
    }

    @Override
    public Integer calculeazaAria() {
        return inaltime*latime;
    }

    public Boolean cazParticular(){
        if(inaltime==latime)
            return true;
        else
            return false;
    }
}
