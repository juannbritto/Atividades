package heranca_6;

public class Fornecedor extends Juridica{
    
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    
    @Override
    public String toString() {
        return "\n Fornecedor: " +
                super.toString() +
                "produto: " + produto;
    }
    
    
}
