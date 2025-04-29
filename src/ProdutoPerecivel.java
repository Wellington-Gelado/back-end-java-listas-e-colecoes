import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {

    private LocalDate dataValidade;

    public ProdutoPerecivel(String nome, BigDecimal preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataValidade.format(formatter);

        return """
                  {
                    nome = %s,
                    preco = %.2f,
                    quantidade = %d,
                    dataValidade = %s
                  }
                """.formatted(super.nome, super.preco, super.quantidade, dataFormatada);
    }
}
