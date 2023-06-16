
package interface2;

public class Main {
    public static void main(String[] args) {
        
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        
        System.out.println("Operações Matemáticas = ");
        System.out.println("\n Soma: " + soma.calcular(10, 5));
        System.out.println("\n Subtração: " + sub.calcular(10, 5));
        System.out.println("\n Multiplicação: " + multiplicacao.calcular(10, 5));
        System.out.println("\n Divisão: " + divisao.calcular(10, 5));
        
    }
}
