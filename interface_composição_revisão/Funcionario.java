package interface_composição_revisão;

import java.time.LocalDate;

public abstract class Funcionario extends Fisica implements SalarioFinal{
    
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected SetorFuncionario setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public SetorFuncionario getSetor() {
        return setor;
    }

    public void setSetor(SetorFuncionario setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Matricula: " + matricula + 
                "\n Setor: " + setor.nome + 
                "\n Salario: " + Util.formatarBrl(salario);
    }
    
    
}
