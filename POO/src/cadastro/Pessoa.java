package cadastro;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    
    private int id;
    private String Name;
    private LocalDate dataNascimento;
    private int telefone;
    private String email;
    private Genero genero;
    private Endereco endereco;

    public Pessoa(int id, String Name, LocalDate dataNascimento, int telefone, String email, Genero genero, Endereco endereco) {
        this.id = id;
        this.Name = Name;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.endereco = endereco;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
