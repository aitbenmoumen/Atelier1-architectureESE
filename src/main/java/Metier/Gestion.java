package Metier;

import DAO.ICalcul;

public class Gestion implements  IGestion{
    ICalcul calcul;
    @Override
    public double getVlue() {
        return calcul.getValue() * 10;
    }
    public void setCalcul(ICalcul calcul) {
        this.calcul = calcul;
    }
}
