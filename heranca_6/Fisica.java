package heranca_6;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa{
    
    protected Genero genero;
    protected EstadoCivil EstadoCivil;
    protected LocalDate dataNascimento;

    public Fisica(Genero genero, EstadoCivil EstadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.genero = genero;
        this.EstadoCivil = EstadoCivil;
        this.dataNascimento = dataNascimento;
    }

    
    
    public int getIdade () {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(EstadoCivil EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Genero: " + genero.texto + 
                "\n EstadoCivil: " + EstadoCivil.texto + 
                "\n dataNascimento: " + dataNascimento +
                "\n Idade: " + getIdade();
    }
    
    
}
