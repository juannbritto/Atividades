package heranca_3;

// Extends =  puxando informações da classe abstrata Funcionario
public class Engenheiro extends Funcionario {
    
    // Atributos
    private String crea;

    //Contrutores
    public Engenheiro(String crea, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    // Getters e Setters
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    // toString
    @Override// pode mudar
    public String toString() {
        return super.toString() + 
                "\n crea=" + crea;
    }
    
    
}
