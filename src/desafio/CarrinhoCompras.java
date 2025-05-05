package desafio;

import java.util.List;

public class CarrinhoCompras implements Comparable<CarrinhoCompras> {

    private  List<CarrinhoCompras> carrinhoCompras;
    private String descricaoCompra;
    private double valorCompra;

    public String getDescricaoCompra() {
        return descricaoCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public CarrinhoCompras (String descricaoCompra, double valorCompra){
        this.descricaoCompra = descricaoCompra;
        this.valorCompra = valorCompra;
    }


    @Override
    public int compareTo(CarrinhoCompras outroCarrinhoCompras) {
        return Double.valueOf(this.valorCompra).compareTo(outroCarrinhoCompras.valorCompra);
    }

    @Override
    public String toString() {
        return descricaoCompra + " - R$" +valorCompra;
    }
}
