
package interface1;

public class Main {
    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("Cachorro: " + cachorro.emitirSom());
        System.out.println("Comida: " + cachorro.comer());
        System.out.println("");
        System.out.println("Gato: " + gato.emitirSom());
        System.out.println("Comida: " + gato.comer());
        System.out.println("");
        System.out.println("Galo: " + galo.emitirSom());
        System.out.println("Comida: " + galo.comer());
        System.out.println("");
        System.out.println("Pato: " + pato.emitirSom());
        System.out.println("Comida: " + pato.comer());
        
    }
  
}
