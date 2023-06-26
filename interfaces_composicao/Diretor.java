package interfaces_composicao;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    
    private final double PREMIO = 0.2; // 20%

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;    
    }

    
    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Pessoa Admitida");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario Demitido");
    }

    @Override
    public String toString() {
        return "\n Diretor: " + 
                super.toString() +
                "\n PREMIO: " + PREMIO +
                "\n Salario Final: " + Util.formatarBrl(getSalarioFinal());
    }
    
    
    
}
