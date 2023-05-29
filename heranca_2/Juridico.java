package heranca_2;

public class Juridico extends Pessoa{
    
    //Atributos
    protected String cnpj;
    protected String inscricaoEstadual;

    //Construtores
    public Juridico(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    // Getters e Setters
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

   // toString
    @Override // pode mudar
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n inscricao Estadual: " + inscricaoEstadual;
    }
    
    
}
