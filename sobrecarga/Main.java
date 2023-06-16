
package sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        System.out.println("Sobrecargas: ");
        System.out.println("\n Inteiro: " + calc.calcular(15, 5));
        System.out.println("\n Double: " + calc.calcular(5.1, 6.9));
        System.out.println("\n String: " + calc.calcular("Senta", "dona"));
        
    }
    
    
}
