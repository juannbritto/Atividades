package interface03;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Autenticavel{
    
    private final double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, interface03.Genero Genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, Genero, salarioBase, dataNascimento, dataAdmissao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.valor;
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\n Diretor: " + 
                super.toString() +
                "PREMIO: " + PREMIO + 
                "\n Salario Final: " + Util.formatarMonetario(getSalarioFinal());
    }
    
    
}
