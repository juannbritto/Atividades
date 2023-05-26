package aula_02;

import java.util.Scanner;

public class loja {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //declaração de variaveis
        System.out.println("Digite o valor da sua compra: ");
        double compra = ler.nextDouble();
        
        //declaração de constante
        final String LOJA = "Loja do João";
        
        //Operadores aritmeticos
        double parcela1 = compra / 5;
        double parcela2 = compra / 5;
        double parcela3 = compra / 5;
        double parcela4 = compra / 5;
        double parcela5 = compra / 5;
        
        //exibindo resultados
        System.out.println("Nome do mercado: " + LOJA);
        System.out.println("O valor da sua compra é de: " + compra);
        System.out.println("Sua 1° parcela é no valor de: " + parcela1);
        System.out.println("Sua 2° parcela é no valor de: " + parcela2);
        System.out.println("Sua 3° parcela é no valor de: " + parcela3);
        System.out.println("Sua 4° parcela é no valor de: " + parcela4);
        System.out.println("Sua 5° parcela é no valor de: " + parcela5);
        
    }
}
