package heranca_6;

import java.time.LocalDate;

public class PrestacaoServico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFinal;

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFinal, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFinal = contratoFinal;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFinal() {
        return contratoFinal;
    }

    public void setContratoFinal(LocalDate contratoFinal) {
        this.contratoFinal = contratoFinal;
    }

    @Override
    public String toString() {
        return "\n Prestacao de Servico: " + 
                super.toString() +
                "\n Inicio do contrato: " + contratoInicio + 
                "\n Final do contrato : " + contratoFinal;
    }
    
    
}
