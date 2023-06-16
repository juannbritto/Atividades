
package statics;

import java.time.LocalDate;

public class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private double salario;

    public Pessoa(String nome, LocalDate dataNascimento, double salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Pessoa = " + 
                "\n Nome: " + nome + 
                "\n Data de Nascimento: " + Util.formatarData(dataNascimento) + 
                "\n Salário: " + Util.formatarMonetario(salario);
    }
    
    
    
}
