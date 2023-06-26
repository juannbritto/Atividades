package videogame;

public class TiroAoAlvoOnline implements Jogo{

    @Override
    public void jogar() {
        System.out.println("Selecione o Alvo");
        System.out.println("Disparo feito");
    }

    @Override
    public void fechar() {
        System.out.println("Fechando o jogo");
    }
    
}
