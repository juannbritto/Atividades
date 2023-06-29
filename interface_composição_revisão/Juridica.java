package interface_composição_revisão;

public abstract class Juridica extends Pessoa{
    
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    

    @Override
    public String toString() {
        return  super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n Inscricao Estadual:" + inscricaoEstadual;
    }
    
    
}
