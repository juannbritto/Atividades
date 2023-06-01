package heranca_4;

import java.time.LocalDate;

public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;
    private LocalDate datainicio;
    private LocalDate dataTermino;
    private double valorContrato;

    public Juridica(String cnpj, String inscricaoEstadual, LocalDate datainicio, LocalDate dataTermino, double valorContato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.datainicio = datainicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContato;
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

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public double getValorContato() {
        return valorContrato;
    }

    public void setValorContato(double valorContato) {
        this.valorContrato = valorContato;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n inscricao Estadual: " + inscricaoEstadual + 
                "\n Data de inicio: " + datainicio + 
                "\n Data de Termino: " + dataTermino + 
                "\n valor Contrato=" + valorContrato;
                
    }
    
    
}
