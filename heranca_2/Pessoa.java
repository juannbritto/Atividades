package heranca_2;

public abstract class Pessoa {
    
    //Atributos
    protected String nome;
    protected String telefone;

    // Construtores
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    //Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //toString
    @Override //pode mudar
    public String toString() {
        return "\n Nome: " + nome + 
                "\n Telefone: " + telefone;
    }
    
    
}
