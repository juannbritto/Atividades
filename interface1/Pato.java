package interface1;
public class Pato implements Animal{

    @Override
    public String emitirSom() {
        return "QUACK!";
    }

    @Override
    public String comer() {
        return "Pão";
    }
    
    
}
