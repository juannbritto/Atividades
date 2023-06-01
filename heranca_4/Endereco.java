package heranca_4;

public class Endereco {
    
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected String cidade;
    protected UnidadeFederativa unidade;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa unidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.unidade = unidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUnidade() {
        return unidade;
    }

    public void setUnidade(UnidadeFederativa unidade) {
        this.unidade = unidade;
    }

    

    @Override
    public String toString() {
        return 
                "\n logradouro: " + logradouro + 
                "\n numero: " + numero + 
                "\n complemento: " + complemento + 
                "\n cep: " + cep + 
                "\n cidade: " + cidade + 
                "\n UF: " + unidade;
    }
    
    
}
