package com.aitbenmoumen;

import DAO.CalculV1;
import DAO.CalculV2;
import DAO.ICalcul;
import Metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) {
        ICalcul calcul = new CalculV1();
        System.out.println(calcul.getValue());

        Gestion gestion = new Gestion();
        gestion.setCalcul(calcul);
        System.out.println(gestion.calcule());

        System.out.println("----------------------------------------");

        ICalcul calcul2 = new CalculV2();
        System.out.println(calcul2.getValue());
        gestion.setCalcul(calcul2);
        System.out.println(gestion.calcule());
    }
}
