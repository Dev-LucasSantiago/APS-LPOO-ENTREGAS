package LuksEntregas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("----Seja Bem-vindo a LuksEntregas----");
        //Menu de comidas
        System.out.println("Escolha o prato:\n1 - Pizza\n2 - Combo Hamburger c/Batata\n3 - Jantar completo");
        int pedidoComida = leitor.nextInt();
        System.out.println("Quantos :");
        int qtdComida = leitor.nextInt();

        //Menu de bebidas
        System.out.println("Escolha sua bebida:\n1 - Sucos\n2 - Refrigerantes\n3 - Água Mineral\n4 - Nenhuma");
        int pedidoBebida = leitor.nextInt();


        //Cadastro do Cliente
        System.out.print("\nDigite seu nome completo: ");
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
