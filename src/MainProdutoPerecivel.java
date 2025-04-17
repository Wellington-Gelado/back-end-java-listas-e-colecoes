import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class MainProdutoPerecivel {

    public static void main(String[] args) {
        ArrayList<ProdutoPerecivel> listaDeProdutos = new ArrayList<>();

        ProdutoPerecivel produto1 =
                new ProdutoPerecivel("Arroz Integral" , new BigDecimal(20.45), 3, new Date(2025/04/20));
        ProdutoPerecivel produto2 = new ProdutoPerecivel("Whey Protein" , new BigDecimal(50), 8, new Date(2025/04/20));
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Aveia" , new BigDecimal(15), 1, new Date(2025/04/20));

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos = " + listaDeProdutos.size());

        System.out.println("O primeiro produto da lista é :\n " + listaDeProdutos.getFirst());

        System.out.println("Imprimindo lista de objetos...");
        System.out.println(listaDeProdutos);

        System.out.println("Imprimindo objetos da lista...");
        for (ProdutoPerecivel produto : listaDeProdutos){
            System.out.println(produto);
        }


    }
}
