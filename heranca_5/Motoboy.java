package heranca_5;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissão) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissão);
    }
    
    

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "\n Placa Da Moto:" + placaDaMoto;
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
}
