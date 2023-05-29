package heranca_3;

// Extends =  puxando informações da classe abstrata Funcionario
public class Medico extends Funcionario {
    
    // Atributos
    private String crm;

    //Contrutores
    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    // Getters e Setters
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // toString
    @Override// pode mudar
    public String toString() {
        return super.toString() + 
                "\n crm=" + crm;
    }
    
    
}
