import java.math.BigDecimal;

public class Produto {

    private final String nome;
    private final BigDecimal preco;
    private final int quantidade;

    public Produto (String nome, BigDecimal preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                  {
                    nome = %s,
                    preco = %.2f,
                    quantidade = %d
                  }
                """.formatted(nome, preco, quantidade);
    }
}
