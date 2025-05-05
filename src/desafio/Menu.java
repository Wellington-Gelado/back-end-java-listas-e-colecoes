package desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Infome o limite do cartão de crédito: ");
        double limiteCartao = scanner.nextDouble();
        scanner.nextLine();

        Cliente cliente1 = new Cliente(nomeCliente, limiteCartao);

        List<CarrinhoCompras> carrinhoCompras = new ArrayList<>();

        int opcao = 1;

        while (opcao == 1) {

            System.out.println("Digite a descrição da compra: ");
            String descricaoCompra=  scanner.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();
            scanner.nextLine(); //Consumir a quebra de linha ao pressionar Enter acima

            CarrinhoCompras compra = new CarrinhoCompras(descricaoCompra, valorCompra);

            if (cliente1.getLimiteCartao() >= valorCompra){
                cliente1.debitarCompraRealizada(valorCompra);
                carrinhoCompras.add(compra);
            }else{
                System.out.println("Limite do cartão de crédito insuficiente!!\n\n");
                //ORDENANDO LISTA DE COMPRAS POR VALOR CRESCENTE
                Collections.sort(carrinhoCompras);

                cliente1.comprasRealizadas(carrinhoCompras);
                return;
            }

            System.out.println("""
                        --  Menu de compras  --
                        
                        Escolha uma opção:
                        
                        0) Sair
                        1) Continuar
                        
                        """);
            opcao = scanner.nextInt();
            scanner.nextLine();

        }
        scanner.close();

        //ORDENANDO LISTA DE COMPRAS POR VALOR CRESCENTE
        Collections.sort(carrinhoCompras);

        cliente1.comprasRealizadas(carrinhoCompras);
    }   
    
}
