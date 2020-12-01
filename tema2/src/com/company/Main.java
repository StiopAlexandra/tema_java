//Scrieti o clasa la alegere care indeplineste urmatoarele conditii:
//  - are minim 3 proprietati
//  - proprietatile au tipuri de date diferite
//  - geterele proprietatilor afiseaza valoarea intr-o fereastra showMessageDialog
//  - seterele proprietatilor citesc valoarea dintr-o fereastra showInputDialog si o salveaza in proprietate
//  - folosind Alt+insert generati metoda toString() ( ar trebui sa rezulte o metoda toString() cu anotarea @Override deasupra)
// In Main cititi x de la tastatura cu fereastra showInputDialog.
// Creati x instante ale clasei de mai sus si introduceti datele obiectelor folosind seterele.
// La final afisati intr-o fereastra showMessageDialog, apelul metodei toString() al celor x obiecte generate (pe rand)
package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName(JOptionPane.showInputDialog(null,"Introduceti numele persoanei:"));
        person.setAge(Integer.parseInt(JOptionPane.showInputDialog(null,"Introduceti varsta persoanei:")));
        person.setMarried(Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Introduceti ~true~ daca persoana este casatorita sau ~false~ in caz contrar: ")));
        String isMarried;
        if(person.getMarried())
            isMarried="is married";
        else
            isMarried="isn't married";
        JOptionPane.showMessageDialog(null,person.getName()+" is "+person.getAge()+" years old. "+person.getName()+" "+isMarried+".");
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduceti valoarea lui x:"));
        Person[] personX = new Person[x];
        for(int i=0;i<x;i++) {
            personX[i]=new Person();
            personX[i].setName(JOptionPane.showInputDialog(null,(i+1)+". Introduceti numele persoanei: "));
            personX[i].setAge(Integer.parseInt(JOptionPane.showInputDialog(null,(i+1)+". Introduceti varsta persoanei:")));
            personX[i].setMarried(Boolean.parseBoolean(JOptionPane.showInputDialog(null,(i+1)+". Introduceti ~true~ daca persoana este casatorita sau ~false~ in caz contrar: ")));
        }
        for(int i=0;i<x;i++)
            JOptionPane.showMessageDialog(null,personX[i].toString());
    }
}
