package videogame;

public class Xadrez implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Selecione a peça que deseja mover");
        System.out.println("Movendo a peca...");
        System.out.println("Vez do oponente...");
        System.out.println("Sua vez");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo");
    }
    
}
