package Herança;

public class Aluno extends Pessoa {
    
    private final double nota;

    public Aluno(double nota, String nome, int idade) {
        super(nome, idade);
        this.nota = nota;
    }

    
    
}
