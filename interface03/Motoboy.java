package interface03;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    
    private String placaMotoboy;

    public Motoboy(String placaMotoboy, String nome, String cpf, String rg, interface03.Genero Genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, Genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaMotoboy = placaMotoboy;
    }

    public String getPlacaMotoboy() {
        return placaMotoboy;
    }

    public void setPlacaMotoboy(String placaMotoboy) {
        this.placaMotoboy = placaMotoboy;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "\n Motoboy: " +
                super.toString() +
                "\n Placa da Motoboy: " + placaMotoboy;
    }
    
    
}
