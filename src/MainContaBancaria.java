import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class MainContaBancaria {
    public static void main(String[] args) {
        List<ContaBancaria> contasBancarias= new ArrayList<>();

        ContaBancaria conta1 = new ContaBancaria(123, 250.26);
        ContaBancaria conta2 = new ContaBancaria(456, 550.56);
        ContaBancaria conta3 = new ContaBancaria(789, 10.26);

        contasBancarias.add(conta1);
        contasBancarias.add(conta2);
        contasBancarias.add(conta3);

        System.out.println("Descobrindo conta com maior saldo - TRADICIONAL");
        ContaBancaria contaMaiorSaldo = contasBancarias.getFirst();
        for (ContaBancaria conta : contasBancarias){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("""
                A conta %d tem o maior saldo = %.2f!!
                """.formatted(contaMaiorSaldo.getConta(), contaMaiorSaldo.getSaldo()));

        System.out.println("Descobrindo conta com maior saldo - STREAM");

        ContaBancaria contaMaiorSaldoStream = contasBancarias.stream()
                .max(Comparator.comparingDouble(ContaBancaria::getSaldo))
                .orElseThrow(() -> new NoSuchElementException("Lista de contas está vazia!"));

        System.out.println("""
                A conta %d tem o maior saldo = %.2f!!
                """.formatted(contaMaiorSaldoStream.getConta(), contaMaiorSaldoStream.getSaldo()));


    }
}
