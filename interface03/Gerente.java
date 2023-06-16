package interface03;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, interface03.Genero Genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, Genero, salarioBase, dataNascimento, dataAdmissao);
    }

    
    @Override
    public double getSalarioFinal() {
        double salarioFinal =0;
        salarioFinal += super.salarioBase * super.bonificacao.valor;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\n Gerente: " + 
                super.toString() +
                "\n Salario Final: " + Util.formatarMonetario(getSalarioFinal());
    }
    
    
}
