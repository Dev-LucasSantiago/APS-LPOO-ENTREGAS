package LuksEntregas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("============ Luks Entregas LTDA ============");

        System.out.print("Digite o local de retirada do pacote:");
        String retPct = leitor.nextLine();

        System.out.print("Digite o Local da entrega do pacote:");
        String entPct = leitor.nextLine();

        System.out.print("Digite a quantidade de pacotes:");
        int qtdPct = leitor.nextInt();



        if(qtdPct >= 10){
            System.out.println("Será necessário algumas viagens de carro");
        }

        if(qtdPct >= 5){
            Entregador entregador = new Carro("Vitor Gabriel","088.194.366-79");
            entregador.entregar();
        }

        if(qtdPct < 5){
            Entregador entregador = new Moto("Adriana","057.899.259-82");
            entregador.entregar();
        }
    }
}
