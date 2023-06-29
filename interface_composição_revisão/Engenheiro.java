package interface_composição_revisão;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    @Override
    public double getSalariofinal() {
        return salario;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n Engenheiro: " +
                super.toString() +
                "\n Crea: " + crea +
                "\n Salario Final: " + Util.formatarBrl(getSalariofinal());
    }
    
    
}
