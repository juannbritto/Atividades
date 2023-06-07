package heranca_6;

import java.time.LocalDate;

public class Medico extends Funcionario {
    
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, heranca_6.EstadoCivil EstadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, EstadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crm = crm;
    }

    

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "\n Medico: " + 
                super.toString() +
                "\n CRM: " + crm;
    }
    
    
}
