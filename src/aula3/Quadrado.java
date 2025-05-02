package aula3;

public class Quadrado implements FormaGeometrica {

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
        return "aula3.Quadrado com lado = " + lado;
    }
}
