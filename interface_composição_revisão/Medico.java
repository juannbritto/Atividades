package interface_composição_revisão;

import java.time.LocalDate;

public class Medico extends Funcionario{
    
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    @Override
    public double getSalariofinal() {
        return salario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\n Medico: " + 
                super.toString() +
                "\n CRM: " + crm +
                "\n Salario Final: " + Util.formatarBrl(getSalariofinal());
    }
    
    
}
