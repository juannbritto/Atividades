package aula_04;

public class Main {
    public static void main(String[] args) {
       
        Pessoa personagem = new Pessoa();
        
        personagem.setNome("Cinderela");
        personagem.setIdade(25);
        personagem.setPeso(70);
        personagem.setAltura(1.73);
        
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Peso: " + personagem.getPeso());
        System.out.println("Altura: " + personagem.getAltura());
    }
}
