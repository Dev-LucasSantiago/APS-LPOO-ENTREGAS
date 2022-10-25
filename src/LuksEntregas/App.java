package LuksEntregas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        System.out.println("======= Luks Entregas LTDA =======");

        System.out.print("Local de recebimento do pacote: ");
        String recPacote = leitor.nextLine();

        System.out.print("Local de destino do pacote: ");
        String destPacote = leitor.nextLine();

        System.out.print("Quantidade de pacotes:");
        int qtdPct = leitor.nextInt();

        if(qtdPct >= 5){
            Entregador entrega = new Carro("Vitor","085.589.849-32");
            entrega.entregar();
        }else if(qtdPct < 5){
            Entregador entrega = new Moto("Adriana","057.399.595-23");
            entrega.entregar();
        }
    }
}
