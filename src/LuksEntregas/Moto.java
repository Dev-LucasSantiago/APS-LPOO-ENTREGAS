package LuksEntregas;

public class Moto extends Entregador{
    private String Placa;
    private String Chassi;
    private String cor;
    private String modelo;

    @Override
    public void entregar(){
        System.out.println("Entrega realizada de moto!");
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
