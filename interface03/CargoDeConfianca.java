package interface03;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
    
    protected Bonificacao bonificacao;

    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, interface03.Genero Genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, Genero, salarioBase, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n Bonificacao: " + bonificacao;
    }
    
    
}
