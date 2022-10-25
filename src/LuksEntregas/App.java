package LuksEntregas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        Cliente cliente = new Cliente();

        //Cadastro do Pedido
        System.out.print("Digite seu nome completo: ");
        String nomeCliente = leitor.nextLine();
        cliente.setNome(nomeCliente);

        System.out.print("Digite o endereço da entrega: ");
        String enderecoCliente = leitor.nextLine();
        cliente.setEndereco(enderecoCliente);

        System.out.print("Digite sua idade: ");
        int idadeCliente = leitor.nextInt();
        cliente.setIdade(idadeCliente);

        System.out.println("Forma de pamento:");

        System.out.println("Pedido Cadastrado com Sucesso!");
        System.out.println("O pedido do Cliente Está em Preparo!");
        System.out.println("Será entregue em "+cliente.getEndereco());


    }
}
