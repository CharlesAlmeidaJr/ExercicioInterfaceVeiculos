package veiculo.modelo;

public class Caminhao extends VeiculoBase{
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    public void setEixos(int eixos){
        this.eixos = eixos;
    }

    public int getEixos(){
        return this.eixos;
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Número de eixos: " + this.eixos);
    }
    
}
