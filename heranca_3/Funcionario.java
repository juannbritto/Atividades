package heranca_3;

// classe abstrata
public abstract class Funcionario {
    
    // Atributos
    protected String nome;
    protected String cpf;
    protected String rg;
    protected double salario;
    
    //Contrutores
    public Funcionario(String nome, String cpf, String rg, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // toString
    @Override // pode mudar
    public String toString() {
        return super.toString() +
                "\n nome: " + nome + 
                "\n cpf: " + cpf + 
                "\n rg=" + rg + 
                "\n salario=" + salario;
    }
    
    
}
