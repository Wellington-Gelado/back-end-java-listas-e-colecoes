import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circulo implements FormaGeometrica{

    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        // Converte o raio para BigDecimal
        BigDecimal raioBD = new BigDecimal(raio);

        // Calcula a área: PI * raio^2
        BigDecimal pi = new BigDecimal(Math.PI);
        BigDecimal area = pi.multiply(raioBD.pow(2));

        // Arredonda para 2 casas decimais
        area = area.setScale(2, RoundingMode.HALF_UP);

        // Retorna a área como double
        return area.doubleValue();
    }

    @Override
    public String toString() {
        return "Círculo com raio = " + raio;
    }
}
