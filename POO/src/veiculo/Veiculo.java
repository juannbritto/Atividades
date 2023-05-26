package veiculo;

public class Veiculo {
   
    private String placa;
    private String Cor;
    private int passageiros;
    private int tanque;
    private int velocidade;
    private int consumo;

    public Veiculo(String placa, String Cor, int passageiros, int tanque, int velocidade, int consumo) {
        this.placa = placa;
        this.Cor = Cor;
        this.passageiros = passageiros;
        this.tanque = tanque;
        this.velocidade = velocidade;
        this.consumo = consumo;
    }
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int taaque) {
        this.tanque = taaque;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    
    
}
