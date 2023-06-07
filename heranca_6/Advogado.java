package heranca_6;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    
    private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, heranca_6.EstadoCivil EstadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, EstadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    

    @Override
    public String toString() {
        return "Advogado: " + 
                super.toString() +
                "\n OAB: " + oab;
    }
    
    
}
