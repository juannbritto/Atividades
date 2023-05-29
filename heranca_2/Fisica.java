package heranca_2;

import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa{
    
    //Atributos
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    // Construtores
    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }
    
   //Getters e setters 
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // toString
    @Override // pode mudar
    public String toString() {
        return super.toString() +
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Data de Nascimento: " + dataNascimento +
                "\n Idade: " + this.getIdade(); // this = está nessa classe.
                
    }
    
    
}
