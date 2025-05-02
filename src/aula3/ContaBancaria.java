package aula3;

public class ContaBancaria {
    private int conta;
    private double saldo;

    ContaBancaria (int conta, double saldo){
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
