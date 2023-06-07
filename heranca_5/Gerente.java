package heranca_5;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissão) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissão);
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
                "\n Salario Final: " + this.getSalarioFinal();
    }

    
    
}
