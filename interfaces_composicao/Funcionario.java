package interfaces_composicao;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{
    
    protected String nome; 
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor; 
    protected double salarioBase;

    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "\n nome: " + nome + 
                "\n Data de Nascimento: " + Util.formatarData(dataNascimento) +
                "\n Idade: " + getIdade() +
                "\n Genero: " + genero.texto + 
                "\n Setor: " + setor.texto + 
                "\n Salario Base: " + Util.formatarBrl(salarioBase);
    }
    
    
}
