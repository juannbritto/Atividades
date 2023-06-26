package videogame;

public class Main {
    public static void main(String[] args) {
        
        VideoGame videoGame = new VideoGame();
        
        videoGame.ligar();
        videoGame.jogar(new PingPong());
        videoGame.fechar();
        videoGame.desligar();
    }
}
