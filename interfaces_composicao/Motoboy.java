package interfaces_composicao;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "\n Motoboy: " + 
                super.toString() +
                "\n Carteira De Habilitacao: " + carteiraDeHabilitacao +
                "\n Salario Final: " + Util.formatarBrl(getSalarioFinal());
    }
    
    
    
}
