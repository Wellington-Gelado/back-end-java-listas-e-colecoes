import java.math.BigDecimal;

public class Quadrado implements FormaGeometrica{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Quadrado com lado = " + lado;
    }
}
