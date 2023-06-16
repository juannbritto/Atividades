
package interface1;

public class Cachorro implements Animal {

    @Override
    public String emitirSom() {
        return "AU AU";
    }

    @Override
    public String comer() {
        return "Ração";
    }
    
}
