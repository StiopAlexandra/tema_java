// Scrieti un program care calculeaza media aritmetica a x numere; 
// x si numerele se introduc de la tastatura folosind mai multe ferestre de dialog.
// La final se afiseaza o fereastra de dialog cu rezultatul.
package com.company;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
    int s=0;
	String x = JOptionPane.showInputDialog("Introduceti numarul de elemente:");
	for(int i=0;i<parseInt(x);i++)
    {
        String nr = JOptionPane.showInputDialog("Introduceti un numar:");
        s=s+parseInt(nr);
    }
	JOptionPane.showMessageDialog(null,"Media aritmetica a numerelor introduse este egala cu  "+(float)s/parseInt(x));
    }
}
