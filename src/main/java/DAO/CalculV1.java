package DAO;
import org.springframework.stereotype.Component;
@Component("cal1")
public class CalculV1 implements ICalcul {
    private double d = 100;
    @Override
    public double getValue() {
        return d;
    }
    public void setD(double d) { this.d = d; }
}
