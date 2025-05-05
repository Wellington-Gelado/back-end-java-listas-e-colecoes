package desafio;

import java.util.List;

public class Cliente {

    private String nome;
    private double limiteCartao;

    public String getNome() {
        return nome;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public Cliente(String nome, double limiteCartao){
        this.nome = nome;
        this.limiteCartao = limiteCartao;
    }

    public void debitarCompraRealizada(double valorCompra){
        this.limiteCartao = this.limiteCartao - valorCompra;
    }

    public void comprasRealizadas(List<CarrinhoCompras> carrinhoCompras){
        System.out.println("""
                        ***********************
                        Compras realizadas....
                        """);

        double totalCompra = 0;

        for (CarrinhoCompras compra : carrinhoCompras) {
            System.out.println(compra);
            totalCompra += compra.getValorCompra();
        }

        System.out.println("""
                
                Valor total compra = %.2f
                ***********************
                
                SALDO DO CARTÃO - %.2f
                """.formatted(totalCompra, this.limiteCartao));
    }
}
