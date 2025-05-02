package aula3;

import java.util.ArrayList;

public class MainExplorandoArray {

    public static void main(String[] args) {
        ArrayList<String> listaNomes= new ArrayList<>();

        String nome1 = new String("Wellington");
        String nome2 = new String("Alana");
        String nome3 = new String("Eliza");

        listaNomes.add(nome1);
        listaNomes.add(nome2);
        listaNomes.add(nome3);

        for(String nome : listaNomes){
            System.out.println("Nome: " + nome);
        }
    }
}
