package interface_composição_revisão;

public class Fornecedor extends Juridica{
    
    private Setor setor;
    private Produto produto;

    public Fornecedor(Setor setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\n Fornecedor: " + 
                super.toString() +
                "\n Setor: " + setor.texto + 
                "\n Produto: " + produto;
    }
    
    
    
}
