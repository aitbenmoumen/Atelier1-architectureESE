package Metier;

import DAO.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gestion implements  IGestion{
    @Autowired
    ICalcul calcul;
    @Override
    public double calcule() {
        return calcul.getValue() * 10;
    }
    public void setCalcul(ICalcul calcul) {
        this.calcul = calcul;
    }
}
