import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Wellington" , 29);
        Pessoa pessoa2 = new Pessoa("Alana" , 23);
        Pessoa pessoa3 = new Pessoa("Eliza" , 0);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista de pessoas = " + listaDePessoas.size());

        System.out.println("A primeira pessoa da lista é : " + listaDePessoas.getFirst());

        System.out.println("Imprimindo lista de objetos...");
        System.out.println(listaDePessoas);

        System.out.println("Imprimindo objetos da lista...");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }
    }
}