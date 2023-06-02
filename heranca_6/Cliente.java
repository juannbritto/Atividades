package heranca_6;

import java.time.LocalDate;

public class Cliente extends Fisica{
    
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, Genero genero, heranca_6.EstadoCivil EstadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, EstadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

        

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return "\nCliente: " + 
                super.toString() +
                "Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
    
}
