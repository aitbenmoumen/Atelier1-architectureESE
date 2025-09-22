package com.aitbenmoumen;

import DAO.CalculV1;
import DAO.ICalcul;
import Metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) {
        ICalcul calcul = new CalculV1();
        System.out.println(calcul.getVlue());

        Gestion gestion = new Gestion();
        gestion.setCalcul(calcul);
        System.out.println(gestion.getVlue());
    }
}
