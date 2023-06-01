package heranca_4;

public abstract class Pessoa {
    
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return 
                "\n id: " + id + 
                "\n nome: " + nome + 
                "\n telefone: " + telefone + 
                "\n endereco: " + endereco;
    }
    
    
}
