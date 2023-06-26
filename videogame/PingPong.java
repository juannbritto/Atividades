package videogame;

public class PingPong implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Procurando oponente");
        System.out.println("Oponente selecionado");
        System.out.println("Para começar faça a jogada");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo...");
    }
    
}
