import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {

    private Date dataValidade;

    public ProdutoPerecivel(String nome, BigDecimal preco, int quantidade, Date dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = sdf.format(dataValidade);

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
