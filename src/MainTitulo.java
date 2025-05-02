import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainTitulo {
    public static void main(String[] args) {
        List<Titulo> listaTitulos = new ArrayList<>();

        Titulo t1 = new Titulo("Senhor dos Anéis");
        Titulo t2 = new Titulo("As Crônicas de Narnia");
        Titulo t3 = new Titulo("Velozes e Furiosos");

        listaTitulos.add(t1);
        listaTitulos.add(t2);
        listaTitulos.add(t3);

        System.out.println("Ordem crescente...");
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        System.out.println("Ordem decrescente...");
        Collections.sort(listaTitulos, Comparator.reverseOrder());
        System.out.println(listaTitulos);
    }

}
