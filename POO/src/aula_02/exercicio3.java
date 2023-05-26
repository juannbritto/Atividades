package aula_02;

import java.util.Scanner;

public class exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
         //declaração de variaveis
        System.out.println("digite o primeiro número: ");
        int a = ler.nextInt();
        
        System.out.println("digite o segundo número: ");
        int b = ler.nextInt();
        
        //Operadores aritméticos
        int multiplicar = a * b;
        int dividir  = a / b;
        int somar = a + b;
        int subtrair = a - b;
        
        //exibindo resultados
        System.out.println("Multiplicar: " + multiplicar);
        System.out.println("Dividir: " + dividir);
        System.out.println("Somar: " + somar);
        System.out.println("Subtair: " + subtrair);
    }
}
