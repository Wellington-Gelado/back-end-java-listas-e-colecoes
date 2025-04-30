public class Cachorro extends Animal{
    private String raca;

    public Cachorro (String nome, int idade, String som, String raca){
        super(nome, idade, som);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("O cachorro " +getNome()+ " está latindo: " +getSom());
    }

    @Override
    public String toString() {
        return """
                Cachorro{
                    nome = '%s',
                    idade = %d,
                    som = '%s',
                    raca = '%s'
                }
                """.formatted(getNome(), getIdade(), getSom(), getRaca());
    }
}
