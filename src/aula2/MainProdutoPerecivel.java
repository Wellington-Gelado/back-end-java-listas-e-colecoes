package aula2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainProdutoPerecivel {

    public static void main(String[] args) {
        ArrayList<ProdutoPerecivel> listaDeProdutos = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        ProdutoPerecivel produto1 =
                new ProdutoPerecivel("Arroz Integral", new BigDecimal(20.45), 3, LocalDate.parse("2025/04/20", formatter));
        ProdutoPerecivel produto2 = new ProdutoPerecivel("Whey Protein", new BigDecimal(50), 8, LocalDate.parse("2025/04/15", formatter));
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Aveia", new BigDecimal(15), 1, LocalDate.parse("2025/04/20", formatter));

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos = " + listaDeProdutos.size());

        System.out.println("O primeiro produto da lista é :\n " + listaDeProdutos.get(0));

        System.out.println("Imprimindo lista de objetos...");
        System.out.println(listaDeProdutos);

        System.out.println("Imprimindo objetos da lista...");
        for (ProdutoPerecivel produto : listaDeProdutos){
            System.out.println(produto);
        }
    }
}
