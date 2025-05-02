package aula3;

public class Animal {
    private String nome;
    private int idade;
    private String som;


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSom() {
        return som;
    }

    public Animal (String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    public void fazerSom(){
        System.out.println(som);
    }

    public void comer(){
        System.out.println(nome + " está comendo.");
    }

    @Override
    public String toString() {
        return "aula3.Animal{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", som='" + som + '\'' +
                '}';
    }
}
