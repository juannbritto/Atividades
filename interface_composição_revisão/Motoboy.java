package interface_composição_revisão;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalariofinal() {
        return salario;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "\n Motoboy: " + 
                super.toString() +
                "\n Carteira De Habilitacao: " + carteiraDeHabilitacao +
                "\n Salario Final: " + Util.formatarBrl(getSalariofinal());
    }
    
    
}
