package aula2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

//        BigDecimal valorTotal = BigDecimal.ZERO;
//        BigDecimal media = BigDecimal.ZERO;

        Produto produto1 = new Produto("Arroz Integral" , BigDecimal.valueOf(20.45), 3);
        Produto produto2 = new Produto("Whey Protein" , BigDecimal.valueOf(50), 8);
        Produto produto3 = new Produto("Aveia" , BigDecimal.valueOf(15), 1);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos = " + listaDeProdutos.size());

        System.out.println("O primeiro produto da lista é : " + listaDeProdutos.getFirst());

        System.out.println("Imprimindo lista de objetos...");
        System.out.println(listaDeProdutos);

        System.out.println("Imprimindo objetos da lista...");
        for (Produto produto : listaDeProdutos){
//            valorTotal = valorTotal.add(produto.getPreco());
            System.out.println(produto);
        }

        if (listaDeProdutos.isEmpty()){
            System.out.println("Lista Vazia, não existe média.");
        }else{
//            media = valorTotal.divide(new BigDecimal(listaDeProdutos.size()), 2, RoundingMode.HALF_UP);
//            System.out.println("Média da lista = " +media+ "!");

            BigDecimal valorTotal = listaDeProdutos.stream()
                    .map(Produto::getPreco)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            BigDecimal media = (listaDeProdutos.size() > 0)
                    ? valorTotal.divide(BigDecimal.valueOf(listaDeProdutos.size()), 2, RoundingMode.HALF_UP)
                    : BigDecimal.ZERO;

            System.out.println("Média dos preços: " + media);
        }



    }
}
