package LuksEntregas;

public class Carro extends Entregador{
    private String Placa;
    private String Chassi;
    private String cor;
    private String modelo;

    public Carro(String nome, String CPF) {
        super(nome, CPF);
    }

    @Override
    public void entregar(String endRecebimento, String endEntrega){
        System.out.println("============================================");
        System.out.println("Entrega será realizada de Carro!\n"+"Pelo entregador(a): "+getNome());
        System.out.println("No endereço: "+endEntrega);
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
