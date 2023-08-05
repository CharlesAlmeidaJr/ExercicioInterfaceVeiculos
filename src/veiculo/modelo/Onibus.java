package veiculo.modelo;

public class Onibus extends VeiculoBase{
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    public void setAssentos(int assentos){
        this.assentos = assentos;
    }

    public int getAssentos(){
        return this.assentos;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Número de assentos: " + this.assentos);
    }
    
}
