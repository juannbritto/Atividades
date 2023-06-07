package heranca_5;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca {
    
    private final double PREMIO = 0.1; // 10%

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissão) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissão);
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
                "PREMIO=" + PREMIO + 100 + "%" +
                "\n Salario Final: " + this.getSalarioFinal();
    }

    

    
    
    
}
