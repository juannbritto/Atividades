package Herança;

public class Professor extends Pessoa {
    
    private String  matricula;

    public Professor(String matricula, String nome, int idade) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    
}
