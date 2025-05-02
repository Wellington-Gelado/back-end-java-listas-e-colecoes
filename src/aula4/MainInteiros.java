package aula4;

import java.util.*;
import java.util.stream.Collectors;

public class MainInteiros {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(2);
        listaInteiros.add(5);
        listaInteiros.add(0);
        listaInteiros.add(50);
        listaInteiros.add(20);

        System.out.println("Ordenação crescente com Collections... ");
        Collections.sort(listaInteiros);

        System.out.println(listaInteiros);

        System.out.println("Ordenação decrescente com Collections... ");
        Collections.sort(listaInteiros, Comparator.reverseOrder());

        System.out.println(listaInteiros);


        System.out.println("Ordenação crescente com Stream... ");
        List<Integer> listaOrdenadaCrescente = listaInteiros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listaOrdenadaCrescente);

        System.out.println("Ordenação decrescente com Stream... ");
        List<Integer> listaOrdenadaDecrescente = listaInteiros.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(listaOrdenadaDecrescente);


    }
}
