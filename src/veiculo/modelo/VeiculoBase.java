package veiculo.modelo;

public abstract class VeiculoBase implements Veiculo{
    protected String placa;
    protected int ano;

    public VeiculoBase (String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getPlaca(){
        return placa;
    }

    public int getAno(){
        return ano;
    }

    public void exibirDados(){
        System.out.println("Placa: " + getPlaca() + "\nAno de fabricação: " + getAno());
    }
}
