import java.math.BigDecimal;
import java.util.ArrayList;

public class MainProduto {

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Arroz Integral" , new BigDecimal(20.45), 3);
        Produto produto2 = new Produto("Whey Protein" , new BigDecimal(50), 8);
        Produto produto3 = new Produto("Aveia" , new BigDecimal(15), 1);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos = " + listaDeProdutos.size());

        System.out.println("O primeiro produto da lista é : " + listaDeProdutos.getFirst());

        System.out.println("Imprimindo lista de objetos...");
        System.out.println(listaDeProdutos);

        System.out.println("Imprimindo objetos da lista...");
        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }
    }
}
