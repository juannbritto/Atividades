package heranca_6;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    
    private String crea;

    public Engenheiro(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, heranca_6.EstadoCivil EstadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, EstadoCivil, dataNascimento, id, nome, telefone, email, endereco);
    }

    

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n Engenheiro: " + 
                super.toString() +
                "CREA: " + crea;
    }
    
    
}
