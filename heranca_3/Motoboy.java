package heranca_3;

// Extends =  puxando informações da classe abstrata Funcionario
public class Motoboy extends Funcionario {
    
    // Atributos
    private String cnh;

    //Contrutores
    public Motoboy(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    // toString
    @Override // pode mudar
    public String toString() {
        return super.toString() +
            "\n cnh: " + cnh;
    }
    
    
}
