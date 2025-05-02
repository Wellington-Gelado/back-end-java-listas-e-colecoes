import java.util.*;

public class MainTitulo {
    public static void main(String[] args) {
//        List<Titulo> listaTitulos = new ArrayList<>();
        List<Titulo> listaTitulos = new LinkedList<>();

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
